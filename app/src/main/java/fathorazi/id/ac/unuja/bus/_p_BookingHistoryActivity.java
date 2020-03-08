package fathorazi.id.ac.unuja.bus;

import Adapter.BookingHistoryAdapter;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import model.BookingHistoryModel;

public class _p_BookingHistoryActivity extends AppCompatActivity implements OnClickListener {
    Animation animation;
    TextView booking;
    private BookingHistoryAdapter bookingHistoryAdapter;
    private ArrayList<BookingHistoryModel> bookingHistoryModels;
    ImageView bus;
    ImageView checked;
    ImageView discount;
    LinearLayout linear1;
    LinearLayout linear2;
    LinearLayout linear3;
    LinearLayout linear4;
    TextView offer;
    TextView profile;
    String[] rate = {"3.5", "3.5", "3.5", "3.5", "3.5", "3.5"};
    private RecyclerView recyclerView;
    TextView search;
    Integer[] star = {Integer.valueOf(R.drawable.ic_star), Integer.valueOf(R.drawable.ic_star), Integer.valueOf(R.drawable.ic_star), Integer.valueOf(R.drawable.ic_star), Integer.valueOf(R.drawable.ic_star), Integer.valueOf(R.drawable.ic_star)};
    ImageView user;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout._p_activity_booking_history);
        this.recyclerView = (RecyclerView) findViewById(R.id.booking_history);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.recyclerView.setItemAnimator(new DefaultItemAnimator());
        this.bookingHistoryModels = new ArrayList<>();
        for (int i = 0; i < this.star.length; i++) {
            this.bookingHistoryModels.add(new BookingHistoryModel(this.star[i], this.rate[i]));
        }
        this.bookingHistoryAdapter = new BookingHistoryAdapter(this, this.bookingHistoryModels);
        this.recyclerView.setAdapter(this.bookingHistoryAdapter);
        this.recyclerView.setFocusableInTouchMode(false);
        this.recyclerView.setNestedScrollingEnabled(false);
        runAnimation(this.recyclerView);
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
        this.checked.setImageResource(R.drawable.ic_bookings_blue);
        this.booking.setTextColor(Color.parseColor("#000000"));
    }

    private void runAnimation(RecyclerView recyclerView2) {
        recyclerView2.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(recyclerView2.getContext(), R.anim.layout_fall_down));
        recyclerView2.getAdapter().notifyDataSetChanged();
        recyclerView2.scheduleLayoutAnimation();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.liner1 /*2131296410*/:
                this.bus.setImageResource(R.drawable.ic_bus_blue);
                this.discount.setImageResource(R.drawable.ic_percentage_gray);
                this.checked.setImageResource(R.drawable.ic_bookings_gray);
                this.user.setImageResource(R.drawable.ic_profile_gray);
                this.search.setTextColor(Color.parseColor("#000000"));
                this.offer.setTextColor(Color.parseColor("#91959d"));
                this.booking.setTextColor(Color.parseColor("#91959d"));
                this.profile.setTextColor(Color.parseColor("#91959d"));
                Intent verifikasi = new Intent(getApplicationContext(), _f_HomeActivity.class);
                finish();
                startActivity(verifikasi);
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
                Intent go = new Intent(getApplicationContext(), _f_OffersActivity.class);
                finish();
                startActivity(go);

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
}
