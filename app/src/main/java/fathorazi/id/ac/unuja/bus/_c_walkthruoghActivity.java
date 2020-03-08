package fathorazi.id.ac.unuja.bus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class _c_walkthruoghActivity extends AppCompatActivity {

    private TextView next;
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_bingobus_walkthruogh);

        next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent verifikasi = new Intent(getApplicationContext(), _d_mobileverificationActivity.class);
                startActivity(verifikasi);
            }
        });
    }
}
