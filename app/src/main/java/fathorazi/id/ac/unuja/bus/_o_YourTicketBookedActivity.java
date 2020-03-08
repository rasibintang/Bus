package fathorazi.id.ac.unuja.bus;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class _o_YourTicketBookedActivity extends AppCompatActivity implements OnClickListener {
    LinearLayout female;
    LinearLayout male;
    TextView txtfemale;
    TextView txtmale;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_bingo_bus_your_ticket_booked);
        this.male = (LinearLayout) findViewById(R.id.male);
        this.female = (LinearLayout) findViewById(R.id.female);
        this.txtmale = (TextView) findViewById(R.id.txtmale);
        this.txtfemale = (TextView) findViewById(R.id.txtfemale);
        this.male.setBackgroundResource(R.drawable.rectangle_cure_blue1);
        this.txtmale.setTextColor(Color.parseColor("#435bd4"));
        this.male.setOnClickListener(this);
        this.female.setOnClickListener(this);
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
