package fathorazi.id.ac.unuja.bus;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import Adapter.OffersAdapter;
import model.OffersModel;

public class _f_OffersActivity extends AppCompatActivity implements OnClickListener {
    TextView booking;
    ImageView bus;
    ImageView checked;
    ImageView discount;
    LinearLayout linear1;
    LinearLayout linear2;
    LinearLayout linear3;
    LinearLayout linear4;
    TextView offer;
    private OffersAdapter offersAdapter;
    private ArrayList<OffersModel> offersModel;
    Integer[] poster = {Integer.valueOf(R.drawable.banner1), Integer.valueOf(R.drawable.banner2), Integer.valueOf(R.drawable.banner3), Integer.valueOf(R.drawable.banner4), Integer.valueOf(R.drawable.banner5), Integer.valueOf(R.drawable.banner6)};
    TextView profile;
    private RecyclerView recyclerView;
    TextView search;
    ImageView user;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout._f_activity_offer);

        this.recyclerView = (RecyclerView) findViewById(R.id.offers);
        this.recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        this.recyclerView.setItemAnimator(new DefaultItemAnimator());
        this.offersModel = new ArrayList<>();
        for (Integer offersModel2 : this.poster) {
            this.offersModel.add(new OffersModel(offersModel2));
        }
        this.offersAdapter = new OffersAdapter(this, this.offersModel);
        this.recyclerView.setAdapter(this.offersAdapter);

        this.linear1 = (LinearLayout) findViewById(R.id.liner1);
        this.linear2 = (LinearLayout) findViewById(R.id.liner2);
        this.linear3 = (LinearLayout) findViewById(R.id.liner3);
        this.linear4 = (LinearLayout) findViewById(R.id.liner4);
        this.bus = (ImageView) findViewById(R.id.bus);
        this.discount = (ImageView) findViewById(R.id.discount);
        this.checked = (ImageView) findViewById(R.id.checked);
        this.user = (ImageView) findViewById(R.id.user);
        this.search = (TextView) findViewById(R.id.search);
        this.offer = (TextView) findViewById(R.id.offer);
        this.booking = (TextView) findViewById(R.id.booking);
        this.profile = (TextView) findViewById(R.id.profile);
        this.linear1.setOnClickListener(this);
        this.linear2.setOnClickListener(this);
        this.linear3.setOnClickListener(this);
        this.linear4.setOnClickListener(this);
    }

    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
                    case R.id.liner1 /*2131296410*/:
                        this.bus.setImageResource(R.drawable.ic_bus_blue);
                        this.discount.setImageResource(R.drawable.ic_percentage_gray);
                        this.checked.setImageResource(R.drawable.ic_bookings_gray);
                        this.user.setImageResource(R.drawable.ic_profile_gray);
                        this.search.setTextColor(Color.parseColor("#000000"));
                        this.offer.setTextColor(Color.parseColor("#91959d"));
                        this.booking.setTextColor(Color.parseColor("#91959d"));
                        this.profile.setTextColor(Color.parseColor("#91959d"));

                        Intent go = new Intent(getApplicationContext(), _f_HomeActivity.class);
                        finish();
                        startActivity(go);

                        return;
                    case R.id.liner2 /*2131296411*/:
                        this.bus.setImageResource(R.drawable.ic_bus_gray);
                        this.discount.setImageResource(R.drawable.ic_percentage_blue);
                        this.checked.setImageResource(R.drawable.ic_bookings_gray);
                        this.user.setImageResource(R.drawable.ic_profile_gray);
                        this.search.setTextColor(Color.parseColor("#91959d"));
                        this.offer.setTextColor(Color.parseColor("#000000"));
                        this.booking.setTextColor(Color.parseColor("#91959d"));
                        this.profile.setTextColor(Color.parseColor("#91959d"));
                        return;
                    case R.id.liner3 /*2131296412*/:
                        this.bus.setImageResource(R.drawable.ic_bus_gray);
                        this.discount.setImageResource(R.drawable.ic_percentage_gray);
                        this.checked.setImageResource(R.drawable.ic_bookings_blue);
                        this.user.setImageResource(R.drawable.ic_profile_gray);
                        this.search.setTextColor(Color.parseColor("#91959d"));
                        this.offer.setTextColor(Color.parseColor("#91959d"));
                        this.booking.setTextColor(Color.parseColor("#000000"));
                        this.profile.setTextColor(Color.parseColor("#91959d"));

                        Intent verifikasi = new Intent(getApplicationContext(), _p_BookingHistoryActivity.class);
                        finish();
                        startActivity(verifikasi);

                        return;
                    case R.id.liner4 /*2131296413*/:
                        this.bus.setImageResource(R.drawable.ic_bus_gray);
                        this.discount.setImageResource(R.drawable.ic_percentage_gray);
                        this.checked.setImageResource(R.drawable.ic_bookings_gray);
                        this.user.setImageResource(R.drawable.ic_profile_blue);
                        this.search.setTextColor(Color.parseColor("#91959d"));
                        this.offer.setTextColor(Color.parseColor("#91959d"));
                        this.booking.setTextColor(Color.parseColor("#91959d"));
                        this.profile.setTextColor(Color.parseColor("#000000"));
                        return;
                    default:
                        return;
                }
    }

    public void onBackPressed() {
        finish();
        overridePendingTransition(R.anim.left_in, R.anim.right_out);
        super.onBackPressed();
    }
}
