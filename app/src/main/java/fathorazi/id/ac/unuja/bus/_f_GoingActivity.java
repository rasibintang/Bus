package fathorazi.id.ac.unuja.bus;

import Adapter.FromAdapter;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;
import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import model.From;

public class _f_GoingActivity extends AppCompatActivity {
    FromAdapter adapter = null;
    AutoCompleteTextView autoCompleteTextView;
    ArrayList<From> froms = null;
    int layout;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout._f_activity_going);
        this.layout = getIntent().getIntExtra("layout", 0);
        this.froms = new ArrayList<>();
        this.froms = populateCustomerData(this.froms);
        this.autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        this.adapter = new FromAdapter(this, this.froms);
        this.autoCompleteTextView.setAdapter(this.adapter);
        this.autoCompleteTextView.setThreshold(1);
        this.autoCompleteTextView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                String obj = adapterView.getItemAtPosition(i).toString();
                Editor edit = _f_GoingActivity.this.getApplicationContext().getSharedPreferences("MyPref", 0).edit();
                if (obj != null) {
                    if (_f_GoingActivity.this.layout == 1) {
                        edit.putString("from", obj);
                    }
                    if (_f_GoingActivity.this.layout == 2) {
                        edit.putString("to", obj);
                    }
                    edit.commit();
                    _f_GoingActivity.this.finish();
                }
            }
        });
    }

    private ArrayList<From> populateCustomerData(ArrayList<From> arrayList) {
        arrayList.add(new From("Ahmedabad", BuildConfig.FLAVOR, 8, R.drawable.clock));
        arrayList.add(new From("Agra", BuildConfig.FLAVOR, 8, R.drawable.clock));
        arrayList.add(new From("Amritsar", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new From("Allahabad", BuildConfig.FLAVOR, 8, R.drawable.clock));
        arrayList.add(new From("Banglore", BuildConfig.FLAVOR, 8, R.drawable.clock));
        arrayList.add(new From("Bhopal", BuildConfig.FLAVOR, 8, R.drawable.clock));
        arrayList.add(new From("Baroda", BuildConfig.FLAVOR, 8, R.drawable.clock));
        arrayList.add(new From("Channei", BuildConfig.FLAVOR, 8, R.drawable.clock));
        arrayList.add(new From("Coimbatore", BuildConfig.FLAVOR, 8, R.drawable.clock));
        arrayList.add(new From("Chandigarh", BuildConfig.FLAVOR, 8, R.drawable.clock));
        arrayList.add(new From("Delhi", BuildConfig.FLAVOR, 1, R.drawable.clock));
        arrayList.add(new From("Dehradun", BuildConfig.FLAVOR, 1, R.drawable.clock));
        arrayList.add(new From("Durgapur", BuildConfig.FLAVOR, 1, R.drawable.clock));
        arrayList.add(new From("Edamon", BuildConfig.FLAVOR, 1, R.drawable.clock));
        arrayList.add(new From("Faridabad", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new From("Gandinager", BuildConfig.FLAVOR, 9, R.drawable.clock));
        arrayList.add(new From("Gadhada", BuildConfig.FLAVOR, 9, R.drawable.clock));
        arrayList.add(new From("Hajipur", BuildConfig.FLAVOR, 9, R.drawable.clock));
        arrayList.add(new From("Indore", BuildConfig.FLAVOR, 3, R.drawable.clock));
        arrayList.add(new From("Jodhpur", BuildConfig.FLAVOR, 1, R.drawable.clock));
        arrayList.add(new From("jaipur", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new From("Kanpur", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new From("Kolkata", BuildConfig.FLAVOR, 1, R.drawable.clock));
        arrayList.add(new From("Lucknow", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new From("Limdi", BuildConfig.FLAVOR, 9, R.drawable.clock));
        arrayList.add(new From("Mumbai", BuildConfig.FLAVOR, 1, R.drawable.clock));
        arrayList.add(new From("Meerut", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new From("Navi Mumbai", BuildConfig.FLAVOR, 1, R.drawable.clock));
        arrayList.add(new From("Nagpur", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new From("Nashik", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new From("Panjab", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new From("Pulav", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new From("puna", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new From("Patna", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new From("Ranchi", BuildConfig.FLAVOR, 1, R.drawable.clock));
        arrayList.add(new From("Rajkot", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new From("Surat", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new From("Sachin", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new From("Sayan", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new From("Srinagar", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new From("Tajpur", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new From("Tadoba", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new From("Tal", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new From("Udaipura (Mp)", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new From("Uttarsanda", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new From("Vapi", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new From("Valsad", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new From("Vadodara", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new From("Wada", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new From("Wadner Bholji", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new From("Yadgir", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new From("Yavat", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new From("Zalansar", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new From("Zadkala", BuildConfig.FLAVOR, 10, R.drawable.clock));
        arrayList.add(new From("Zirakpur", BuildConfig.FLAVOR, 10, R.drawable.clock));
        return arrayList;
    }
}
