package fathorazi.id.ac.unuja.bus;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class _n_Last_StepActivity extends AppCompatActivity implements OnClickListener {
    ImageView back;
    LinearLayout female;
    ImageView img1;
    ImageView img2;
    LinearLayout male;
    TextView txtfemale;
    TextView txtmale;
    private TextView searchbus;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout._n_activity_last_step);
        this.male = (LinearLayout) findViewById(R.id.male);
        this.female = (LinearLayout) findViewById(R.id.female);
        this.txtmale = (TextView) findViewById(R.id.txtmale);
        this.txtfemale = (TextView) findViewById(R.id.txtfemale);
        this.img1 = (ImageView) findViewById(R.id.img1);
        this.img2 = (ImageView) findViewById(R.id.img2);
        this.img1.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                _n_Last_StepActivity.this.img1.setVisibility(View.GONE);
                _n_Last_StepActivity.this.img2.setVisibility(View.VISIBLE);
            }
        });
        this.img2.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                _n_Last_StepActivity.this.img2.setVisibility(View.GONE);
                _n_Last_StepActivity.this.img1.setVisibility(View.VISIBLE);
            }
        });
        this.male.setOnClickListener(this);
        this.female.setOnClickListener(this);

        searchbus = findViewById(R.id.searchbus);
        searchbus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent verifikasi = new Intent(getApplicationContext(), _o_YourTicketBookedActivity.class);
                startActivity(verifikasi);
            }
        });
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.female) {
            this.female.setBackgroundResource(R.drawable.rectangle_cure_blue1);
            this.male.setBackgroundResource(R.drawable.rectangle_cure_gray);
            this.txtfemale.setTextColor(Color.parseColor("#435bd4"));
            this.txtmale.setTextColor(Color.parseColor("#91959d"));
        } else if (id == R.id.male) {
            this.male.setBackgroundResource(R.drawable.rectangle_cure_blue1);
            this.female.setBackgroundResource(R.drawable.rectangle_cure_gray);
            this.txtmale.setTextColor(Color.parseColor("#435bd4"));
            this.txtfemale.setTextColor(Color.parseColor("#91959d"));
        }
    }
}
