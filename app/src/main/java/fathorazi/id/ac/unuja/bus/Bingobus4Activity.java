package fathorazi.id.ac.unuja.bus;

import Adapter.CustomerAdapter;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;
import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import model.Customer;

public class Bingobus4Activity extends AppCompatActivity {
    CustomerAdapter adapter = null;
    AutoCompleteTextView autoCompleteTextView;
    ArrayList<Customer> customers = null;
    int layout;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_bingobus4);
        this.layout = getIntent().getIntExtra("layout", 0);
        this.customers = new ArrayList<>();
        this.customers = populateCustomerData(this.customers);
        this.autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        this.adapter = new CustomerAdapter(this, this.customers);
        this.autoCompleteTextView.setAdapter(this.adapter);
        this.autoCompleteTextView.setThreshold(1);
        this.autoCompleteTextView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                String obj = adapterView.getItemAtPosition(i).toString();
                Editor edit = Bingobus4Activity.this.getApplicationContext().getSharedPreferences("MyPref", 0).edit();
                if (obj == null) {
                    return;
                }
                if (Bingobus4Activity.this.layout == 1) {
                    edit.putString("from", obj);
                    edit.commit();
                    Bingobus4Activity.this.layout = 2;
                    Bingobus4Activity.this.customers.clear();
                    Bingobus4Activity.this.adapter.notifyDataSetChanged();
                    Bingobus4Activity.this.customers = Bingobus4Activity.this.populateCustomerData(Bingobus4Activity.this.customers);
                    Bingobus4Activity.this.adapter.notifyDataSetChanged();
                    Bingobus4Activity.this.autoCompleteTextView.setText(BuildConfig.FLAVOR);
                    Bingobus4Activity.this.autoCompleteTextView.setHint("Going where?");
                } else if (Bingobus4Activity.this.layout == 2) {
                    edit.putString("to", obj);
                    edit.commit();
                    Bingobus4Activity.this.finish();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public ArrayList<Customer> populateCustomerData(ArrayList<Customer> arrayList) {
        arrayList.add(new Customer("Ahmedabad", BuildConfig.FLAVOR, 8, R.drawable.clock));
        arrayList.add(new Customer("Agra", BuildConfig.FLAVOR, 8, R.drawable.clock));
        arrayList.add(new Customer("Amritsar", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new Customer("Allahabad", BuildConfig.FLAVOR, 8, R.drawable.clock));
        arrayList.add(new Customer("Banglore", BuildConfig.FLAVOR, 8, R.drawable.clock));
        arrayList.add(new Customer("Bhopal", BuildConfig.FLAVOR, 8, R.drawable.clock));
        arrayList.add(new Customer("Baroda", BuildConfig.FLAVOR, 8, R.drawable.clock));
        arrayList.add(new Customer("Channei", BuildConfig.FLAVOR, 8, R.drawable.clock));
        arrayList.add(new Customer("Coimbatore", BuildConfig.FLAVOR, 8, R.drawable.clock));
        arrayList.add(new Customer("Chandigarh", BuildConfig.FLAVOR, 8, R.drawable.clock));
        arrayList.add(new Customer("Delhi", BuildConfig.FLAVOR, 1, R.drawable.clock));
        arrayList.add(new Customer("Dehradun", BuildConfig.FLAVOR, 1, R.drawable.clock));
        arrayList.add(new Customer("Durgapur", BuildConfig.FLAVOR, 1, R.drawable.clock));
        arrayList.add(new Customer("Edamon", BuildConfig.FLAVOR, 1, R.drawable.clock));
        arrayList.add(new Customer("Faridabad", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new Customer("Gandinager", BuildConfig.FLAVOR, 9, R.drawable.clock));
        arrayList.add(new Customer("Gadhada", BuildConfig.FLAVOR, 9, R.drawable.clock));
        arrayList.add(new Customer("Hajipur", BuildConfig.FLAVOR, 9, R.drawable.clock));
        arrayList.add(new Customer("Indore", BuildConfig.FLAVOR, 3, R.drawable.clock));
        arrayList.add(new Customer("Jodhpur", BuildConfig.FLAVOR, 1, R.drawable.clock));
        arrayList.add(new Customer("jaipur", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new Customer("Kanpur", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new Customer("Kolkata", BuildConfig.FLAVOR, 1, R.drawable.clock));
        arrayList.add(new Customer("Lucknow", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new Customer("Limdi", BuildConfig.FLAVOR, 9, R.drawable.clock));
        arrayList.add(new Customer("Mumbai", BuildConfig.FLAVOR, 1, R.drawable.clock));
        arrayList.add(new Customer("Meerut", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new Customer("Navi Mumbai", BuildConfig.FLAVOR, 1, R.drawable.clock));
        arrayList.add(new Customer("Nagpur", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new Customer("Nashik", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new Customer("Panjab", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new Customer("Pulav", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new Customer("puna", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new Customer("Patna", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new Customer("Ranchi", BuildConfig.FLAVOR, 1, R.drawable.clock));
        arrayList.add(new Customer("Rajkot", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new Customer("Surat", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new Customer("Sachin", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new Customer("Sayan", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new Customer("Srinagar", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new Customer("Tajpur", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new Customer("Tadoba", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new Customer("Tal", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new Customer("Udaipura (Mp)", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new Customer("Uttarsanda", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new Customer("Vapi", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new Customer("Valsad", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new Customer("Vadodara", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new Customer("Wada", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new Customer("Wadner Bholji", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new Customer("Yadgir", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new Customer("Yavat", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new Customer("Zalansar", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new Customer("Zadkala", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new Customer("Zirakpur", BuildConfig.FLAVOR, 10, R.drawable.clock));
        return arrayList;
    }
}
