package fathorazi.id.ac.unuja.bus;

import Adapter.CustomSpinnerAdapter;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import model.Country;

public class Bingobus_Select_CountryActivity extends AppCompatActivity {
    Animation animation;
    ImageView back;
    public List<Country> countries = new ArrayList();
    TextView next;
    private Spinner spinner;
    private CustomSpinnerAdapter spinnerAdapter;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_bingobus_select_country);
        this.spinner = findViewById(R.id.spinner);
        this.spinnerAdapter = new CustomSpinnerAdapter(this, this.countries);
        this.spinner.setAdapter(this.spinnerAdapter);
        this.spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onNothingSelected(AdapterView<?> adapterView) {
            }

            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                Country country = Bingobus_Select_CountryActivity.this.countries.get(i);
            }
        });
        populateCountries();

        this.next = findViewById(R.id.next);
        ne
    }

    private void populateCountries() {
        Country country = new Country();
        country.name = "INDONESIA";
        country.flag = R.drawable.flag_indonesia;
        Country country2 = new Country();
        country2.name = "USA";
        country2.flag = R.drawable.flag_usa;
        Country country3 = new Country();
        country3.name = "GERMANY";
        country3.flag = R.drawable.flag_germany;
        Country country4 = new Country();
        country4.name = "CHINA";
        country4.flag = R.drawable.flag_china;
        Country country5 = new Country();
        country5.name = "INDIA";
        country5.flag = R.drawable.flag_india;
        this.countries.add(country);
        this.countries.add(country2);
        this.countries.add(country3);
        this.countries.add(country4);
        this.countries.add(country5);
        this.spinnerAdapter.notifyDataSetChanged();
    }
}
