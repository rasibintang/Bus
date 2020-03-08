package fathorazi.id.ac.unuja.bus;

import Adapter.OffersAdapter;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import model.OffersModel;

public class Bingobus24Activity extends AppCompatActivity implements OnClickListener {
    private static final String TAG = "DatePicer";
    private static final String TAG1 = "DatePicer1";
    TextView booking;
    ImageView bus;
    LinearLayout calender1;
    LinearLayout calenderreturn;
    ImageView checked;
    FrameLayout circle1;
    FrameLayout circle2;
    FrameLayout circle3;
    FrameLayout circle4;
    FrameLayout circle5;
    FrameLayout circle6;
    String country1;
    String country2;
    TextView date1;
    TextView date2;
    TextView date3;
    OnDateSetListener dateSetListener;
    OnDateSetListener dateSetListener1;
    TextView date_select1;
    TextView date_select2;
    TextView date_select3;
    TextView day1;
    TextView day2;
    TextView day3;
    TextView day4;
    TextView day5;
    TextView day6;
    ImageView discount;
    TextView downtext;
    LinearLayout goingfrom;
    LinearLayout goingto;
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
    TextView searchbus;
    LinearLayout showdata;
    LinearLayout showdata1;
    ImageView swap;
    TextView uptext;
    ImageView user;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_bingobus24);
        this.goingfrom = (LinearLayout) findViewById(R.id.goingfrom);
        this.goingto = (LinearLayout) findViewById(R.id.goingto);
        this.searchbus = (TextView) findViewById(R.id.searchbus);
        this.goingfrom.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Bingobus24Activity.this, Bingobus4Activity.class);
                intent.putExtra("layout", 1);
                Bingobus24Activity.this.startActivity(intent);
            }
        });
        this.date1 = (TextView) findViewById(R.id.date1);
        this.date2 = (TextView) findViewById(R.id.date2);
        this.date3 = (TextView) findViewById(R.id.date3);
        this.uptext = (TextView) findViewById(R.id.uptext);
        this.downtext = (TextView) findViewById(R.id.downtext);
        this.swap = (ImageView) findViewById(R.id.swap);
        this.swap.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                String charSequence = Bingobus24Activity.this.uptext.getText().toString();
                Bingobus24Activity.this.uptext.setText(Bingobus24Activity.this.downtext.getText().toString());
                Bingobus24Activity.this.downtext.setText(charSequence);
            }
        });
        this.calender1 = (LinearLayout) findViewById(R.id.calender1);
        this.calender1.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Calendar instance = Calendar.getInstance();
                DatePickerDialog datePickerDialog = new DatePickerDialog(Bingobus24Activity.this, AlertDialog.THEME_DEVICE_DEFAULT_DARK, Bingobus24Activity.this.dateSetListener, instance.get(1), instance.get(2), instance.get(5));
                datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                datePickerDialog.show();
            }
        });
        this.dateSetListener = new OnDateSetListener() {
            public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                String format = new SimpleDateFormat("EEE").format(new Date(i, i2 + 1, i3));
                if (format.equals("Sun")) {
                    Bingobus24Activity.this.day1.setText("Sat");
                    Bingobus24Activity.this.day2.setText("Sun");
                    Bingobus24Activity.this.day3.setText("Mon");
                } else if (format.equals("Mon")) {
                    Bingobus24Activity.this.day1.setText("Sun");
                    Bingobus24Activity.this.day2.setText("Mon");
                    Bingobus24Activity.this.day3.setText("Tue");
                } else if (format.equals("Tue")) {
                    Bingobus24Activity.this.day1.setText("Mon");
                    Bingobus24Activity.this.day2.setText("Tue");
                    Bingobus24Activity.this.day3.setText("Wed");
                } else if (format.equals("Wed")) {
                    Bingobus24Activity.this.day1.setText("Tue");
                    Bingobus24Activity.this.day2.setText("Wed");
                    Bingobus24Activity.this.day3.setText("Tur");
                } else if (format.equals("Tur")) {
                    Bingobus24Activity.this.day1.setText("Wed");
                    Bingobus24Activity.this.day2.setText("Tur");
                    Bingobus24Activity.this.day3.setText("Fri");
                } else if (format.equals("Fri")) {
                    Bingobus24Activity.this.day1.setText("Tur");
                    Bingobus24Activity.this.day2.setText("Fri");
                    Bingobus24Activity.this.day3.setText("Sat");
                } else if (format.equals("Sat")) {
                    Bingobus24Activity.this.day1.setText("Fri");
                    Bingobus24Activity.this.day2.setText("Sat");
                    Bingobus24Activity.this.day3.setText("Sun");
                }
                String str = Bingobus24Activity.TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("onDateSet: dd: ");
                sb.append(i3);
                Log.d(str, sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i3);
                sb2.append(BuildConfig.FLAVOR);
                Bingobus24Activity.this.date1.setText(sb2.toString());
                Bingobus24Activity.this.date1.setText(String.valueOf(Integer.valueOf(String.valueOf(i3)).intValue()));
                Bingobus24Activity.this.date2.setText(String.valueOf(Integer.valueOf(String.valueOf(i3)).intValue() + 1));
                Bingobus24Activity.this.date3.setText(String.valueOf(Integer.valueOf(String.valueOf(i3)).intValue() + 2));
            }
        };
        this.calenderreturn = (LinearLayout) findViewById(R.id.calenderreturn);
        this.calenderreturn.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Calendar instance = Calendar.getInstance();
                DatePickerDialog datePickerDialog = new DatePickerDialog(Bingobus24Activity.this, AlertDialog.THEME_DEVICE_DEFAULT_LIGHT, Bingobus24Activity.this.dateSetListener1, instance.get(1), instance.get(2), instance.get(5));
                datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                datePickerDialog.show();
            }
        });
        this.dateSetListener1 = new OnDateSetListener() {
            public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                String format = new SimpleDateFormat("EEE").format(new Date(i, i2 + 1, i3));
                if (format.equals("Sun")) {
                    Bingobus24Activity.this.day4.setText("Sat");
                    Bingobus24Activity.this.day5.setText("Sun");
                    Bingobus24Activity.this.day6.setText("Mon");
                } else if (format.equals("Mon")) {
                    Bingobus24Activity.this.day4.setText("Sun");
                    Bingobus24Activity.this.day5.setText("Mon");
                    Bingobus24Activity.this.day6.setText("Tue");
                } else if (format.equals("Tue")) {
                    Bingobus24Activity.this.day4.setText("Mon");
                    Bingobus24Activity.this.day5.setText("Tue");
                    Bingobus24Activity.this.day6.setText("Wed");
                } else if (format.equals("Wed")) {
                    Bingobus24Activity.this.day4.setText("Tue");
                    Bingobus24Activity.this.day5.setText("Wed");
                    Bingobus24Activity.this.day6.setText("Tur");
                } else if (format.equals("Tur")) {
                    Bingobus24Activity.this.day4.setText("Wed");
                    Bingobus24Activity.this.day5.setText("Tur");
                    Bingobus24Activity.this.day6.setText("Fri");
                } else if (format.equals("Fri")) {
                    Bingobus24Activity.this.day4.setText("Tur");
                    Bingobus24Activity.this.day5.setText("Fri");
                    Bingobus24Activity.this.day6.setText("Sat");
                } else if (format.equals("Sat")) {
                    Bingobus24Activity.this.day4.setText("Fri");
                    Bingobus24Activity.this.day5.setText("Sat");
                    Bingobus24Activity.this.day6.setText("Sun");
                }
                String str = Bingobus24Activity.TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("onDateSet: dd: ");
                sb.append(i3);
                Log.d(str, sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i3);
                sb2.append(BuildConfig.FLAVOR);
                Bingobus24Activity.this.date_select1.setText(sb2.toString());
                Bingobus24Activity.this.date_select1.setText(String.valueOf(Integer.valueOf(String.valueOf(i3)).intValue()));
                Bingobus24Activity.this.date_select2.setText(String.valueOf(Integer.valueOf(String.valueOf(i3)).intValue() + 1));
                Bingobus24Activity.this.date_select3.setText(String.valueOf(Integer.valueOf(String.valueOf(i3)).intValue() + 2));
            }
        };
        this.recyclerView = (RecyclerView) findViewById(R.id.offers);
        this.recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        this.recyclerView.setItemAnimator(new DefaultItemAnimator());
        this.offersModel = new ArrayList<>();
        for (Integer offersModel2 : this.poster) {
            this.offersModel.add(new OffersModel(offersModel2));
        }
        this.offersAdapter = new OffersAdapter(this, this.offersModel);
        this.recyclerView.setAdapter(this.offersAdapter);
        this.showdata = (LinearLayout) findViewById(R.id.showdata);
        this.showdata1 = (LinearLayout) findViewById(R.id.showdata1);
        this.showdata.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Bingobus24Activity.this.showdata.setVisibility(View.GONE);
                Bingobus24Activity.this.showdata1.setVisibility(View.VISIBLE);
            }
        });
        this.circle1 = (FrameLayout) findViewById(R.id.circle1);
        this.circle2 = (FrameLayout) findViewById(R.id.circle2);
        this.circle3 = (FrameLayout) findViewById(R.id.circle3);
        this.circle4 = (FrameLayout) findViewById(R.id.circle4);
        this.circle5 = (FrameLayout) findViewById(R.id.circle5);
        this.circle6 = (FrameLayout) findViewById(R.id.circle6);
        this.date_select1 = (TextView) findViewById(R.id.date_select1);
        this.date_select2 = (TextView) findViewById(R.id.date_select2);
        this.date_select3 = (TextView) findViewById(R.id.date_select3);
        this.day1 = (TextView) findViewById(R.id.day1);
        this.day2 = (TextView) findViewById(R.id.day2);
        this.day3 = (TextView) findViewById(R.id.day3);
        this.day4 = (TextView) findViewById(R.id.day4);
        this.day5 = (TextView) findViewById(R.id.day5);
        this.day6 = (TextView) findViewById(R.id.day6);
        this.circle1.setOnClickListener(this);
        this.circle2.setOnClickListener(this);
        this.circle3.setOnClickListener(this);
        this.circle4.setOnClickListener(this);
        this.circle5.setOnClickListener(this);
        this.circle6.setOnClickListener(this);
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
            case R.id.circle1 /*2131296317*/:
                this.circle1.setBackgroundResource(R.drawable.circle_blue);
                this.circle2.setBackgroundResource(R.drawable.circle_white);
                this.circle3.setBackgroundResource(R.drawable.circle_white);
                this.date1.setTextColor(Color.parseColor("#ffffff"));
                this.date2.setTextColor(Color.parseColor("#91959d"));
                this.date3.setTextColor(Color.parseColor("#91959d"));
                this.day1.setTextColor(Color.parseColor("#ffffff"));
                this.day2.setTextColor(Color.parseColor("#91959d"));
                this.day3.setTextColor(Color.parseColor("#91959d"));
                return;
            case R.id.circle2 /*2131296318*/:
                this.circle1.setBackgroundResource(R.drawable.circle_white);
                this.circle2.setBackgroundResource(R.drawable.circle_blue);
                this.circle3.setBackgroundResource(R.drawable.circle_white);
                this.date1.setTextColor(Color.parseColor("#91959d"));
                this.date2.setTextColor(Color.parseColor("#ffffff"));
                this.date3.setTextColor(Color.parseColor("#91959d"));
                this.day1.setTextColor(Color.parseColor("#91959d"));
                this.day2.setTextColor(Color.parseColor("#ffffff"));
                this.day3.setTextColor(Color.parseColor("#91959d"));
                return;
            case R.id.circle3 /*2131296319*/:
                this.circle1.setBackgroundResource(R.drawable.circle_white);
                this.circle2.setBackgroundResource(R.drawable.circle_white);
                this.circle3.setBackgroundResource(R.drawable.circle_blue);
                this.date1.setTextColor(Color.parseColor("#91959d"));
                this.date2.setTextColor(Color.parseColor("#91959d"));
                this.date3.setTextColor(Color.parseColor("#ffffff"));
                this.day1.setTextColor(Color.parseColor("#91959d"));
                this.day2.setTextColor(Color.parseColor("#91959d"));
                this.day3.setTextColor(Color.parseColor("#ffffff"));
                return;
            case R.id.circle4 /*2131296320*/:
                this.circle4.setBackgroundResource(R.drawable.circle_blue);
                this.circle5.setBackgroundResource(R.drawable.circle_white);
                this.circle6.setBackgroundResource(R.drawable.circle_white);
                this.date_select1.setTextColor(Color.parseColor("#ffffff"));
                this.date_select2.setTextColor(Color.parseColor("#91959d"));
                this.date_select3.setTextColor(Color.parseColor("#91959d"));
                this.day4.setTextColor(Color.parseColor("#ffffff"));
                this.day5.setTextColor(Color.parseColor("#91959d"));
                this.day6.setTextColor(Color.parseColor("#91959d"));
                return;
            case R.id.circle5 /*2131296321*/:
                this.circle4.setBackgroundResource(R.drawable.circle_white);
                this.circle5.setBackgroundResource(R.drawable.circle_blue);
                this.circle6.setBackgroundResource(R.drawable.circle_white);
                this.date_select1.setTextColor(Color.parseColor("#91959d"));
                this.date_select2.setTextColor(Color.parseColor("#ffffff"));
                this.date_select3.setTextColor(Color.parseColor("#91959d"));
                this.day4.setTextColor(Color.parseColor("#91959d"));
                this.day5.setTextColor(Color.parseColor("#ffffff"));
                this.day6.setTextColor(Color.parseColor("#91959d"));
                return;
            case R.id.circle6 /*2131296322*/:
                this.circle4.setBackgroundResource(R.drawable.circle_white);
                this.circle5.setBackgroundResource(R.drawable.circle_white);
                this.circle6.setBackgroundResource(R.drawable.circle_blue);
                this.date_select1.setTextColor(Color.parseColor("#91959d"));
                this.date_select2.setTextColor(Color.parseColor("#91959d"));
                this.date_select3.setTextColor(Color.parseColor("#ffffff"));
                this.day4.setTextColor(Color.parseColor("#91959d"));
                this.day5.setTextColor(Color.parseColor("#91959d"));
                this.day6.setTextColor(Color.parseColor("#ffffff"));
                return;
            default:
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

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("MyPref", 0);
        this.uptext.setText(sharedPreferences.getString("from", null));
        this.downtext.setText(sharedPreferences.getString("to", null));
    }

    public void onBackPressed() {
        Intent intent = new Intent(this, ListinwsActivity.class);
        finish();
        overridePendingTransition(R.anim.left_in, R.anim.right_out);
        startActivity(intent);
        super.onBackPressed();
    }
}
