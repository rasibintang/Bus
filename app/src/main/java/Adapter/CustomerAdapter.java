package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;

import fathorazi.id.ac.unuja.bus.R;
import model.Customer;

public class CustomerAdapter extends ArrayAdapter<Customer> {
    ArrayList<Customer> customers;
    Filter myFilter = new Filter() {
        public CharSequence convertResultToString(Object obj) {
            Customer customer = (Customer) obj;
            StringBuilder sb = new StringBuilder();
            sb.append(customer.getFirstName());
            sb.append(" ");
            sb.append(customer.getLastName());
            return sb.toString();
        }

        /* access modifiers changed from: protected */
        public FilterResults performFiltering(CharSequence charSequence) {
            if (charSequence == null) {
                return new FilterResults();
            }
            CustomerAdapter.this.suggestions.clear();
            Iterator it = CustomerAdapter.this.tempCustomer.iterator();
            while (it.hasNext()) {
                Customer customer = (Customer) it.next();
                if (customer.getFirstName().toLowerCase().startsWith(charSequence.toString().toLowerCase())) {
                    CustomerAdapter.this.suggestions.add(customer);
                }
            }
            FilterResults filterResults = new FilterResults();
            filterResults.values = CustomerAdapter.this.suggestions;
            filterResults.count = CustomerAdapter.this.suggestions.size();
            return filterResults;
        }

        /* access modifiers changed from: protected */
        public void publishResults(CharSequence charSequence, FilterResults filterResults) {
            ArrayList arrayList = (ArrayList) filterResults.values;
            if (filterResults != null && filterResults.count > 0) {
                CustomerAdapter.this.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    CustomerAdapter.this.add((Customer) it.next());
                    CustomerAdapter.this.notifyDataSetChanged();
                }
            }
        }
    };
    int myPos = 0;
    ArrayList<Customer> suggestions;
    ArrayList<Customer> tempCustomer;

    public CustomerAdapter(Context context, ArrayList<Customer> arrayList) {
        super(context, R.layout.customer_row1, arrayList);
        this.customers = arrayList;
        this.tempCustomer = new ArrayList<>(arrayList);
        this.suggestions = new ArrayList<>(arrayList);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        Customer customer = (Customer) getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.customer_row1, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(R.id.tvCustomer);
        ImageView imageView = (ImageView) view.findViewById(R.id.ivCustomerImage);
        TextView textView2 = (TextView) view.findViewById(R.id.text);
        if (i == 0) {
            textView2.setVisibility(View.VISIBLE);
        } else {
            textView2.setVisibility(View.GONE);
        }
        if (textView != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(customer.getFirstName());
            sb.append(" ");
            sb.append(customer.getLastName());
            textView.setText(sb.toString());
        }
        if (!(imageView == null || customer.getProfilePic() == -1)) {
            imageView.setImageResource(customer.getProfilePic());
        }
        return view;
    }

    public Filter getFilter() {
        return this.myFilter;
    }
}
