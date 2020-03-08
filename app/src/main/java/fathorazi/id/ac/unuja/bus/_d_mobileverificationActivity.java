package fathorazi.id.ac.unuja.bus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class _d_mobileverificationActivity extends Activity {

    private TextView forward, editphone;
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout._d_activity_mobileverification);

        forward = findViewById(R.id.forward);
        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent verifikasi = new Intent(getApplicationContext(), _f_HomeActivity.class);
                finish();
                startActivity(verifikasi);
            }
        });

        editphone = findViewById(R.id.editphone);
        editphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent verifikasi = new Intent(getApplicationContext(), _e_Edit_MobileActivity.class);
                startActivity(verifikasi);
            }
        });
    }
}
