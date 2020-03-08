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
import model.From;

public class FromAdapter extends ArrayAdapter<From> {
    ArrayList<From> froms;
    Filter myFilter = new Filter() {
        public CharSequence convertResultToString(Object obj) {
            From from = (From) obj;
            StringBuilder sb = new StringBuilder();
            sb.append(from.getFirstName());
            sb.append(" ");
            sb.append(from.getLastName());
            return sb.toString();
        }

        public FilterResults performFiltering(CharSequence charSequence) {
            if (charSequence == null) {
                return new FilterResults();
            }
            FromAdapter.this.suggestions.clear();
            Iterator it = FromAdapter.this.tempFrom.iterator();
            while (it.hasNext()) {
                From from = (From) it.next();
                if (from.getFirstName().toLowerCase().startsWith(charSequence.toString().toLowerCase())) {
                    FromAdapter.this.suggestions.add(from);
                }
            }
            FilterResults filterResults = new FilterResults();
            filterResults.values = FromAdapter.this.suggestions;
            filterResults.count = FromAdapter.this.suggestions.size();
            return filterResults;
        }

        public void publishResults(CharSequence charSequence, FilterResults filterResults) {
            ArrayList arrayList = (ArrayList) filterResults.values;
            if (filterResults != null && filterResults.count > 0) {
                FromAdapter.this.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    FromAdapter.this.add((From) it.next());
                    FromAdapter.this.notifyDataSetChanged();
                }
            }
        }
    };
    int myPos = 0;
    ArrayList<From> suggestions;
    ArrayList<From> tempFrom;

    public FromAdapter(Context context, ArrayList<From> arrayList) {
        super(context, R.layout.item_from, arrayList);
        this.froms = arrayList;
        this.tempFrom = new ArrayList<>(arrayList);
        this.suggestions = new ArrayList<>(arrayList);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        From from = (From) getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.item_from, viewGroup, false);
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
            sb.append(from.getFirstName());
            sb.append(" ");
            sb.append(from.getLastName());
            textView.setText(sb.toString());
        }
        if (!(imageView == null || from.getProfilePic() == -1)) {
            imageView.setImageResource(from.getProfilePic());
        }
        return view;
    }

    public Filter getFilter() {
        return this.myFilter;
    }
}
