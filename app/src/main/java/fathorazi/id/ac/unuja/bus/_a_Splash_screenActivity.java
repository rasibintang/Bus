package fathorazi.id.ac.unuja.bus;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class _a_Splash_screenActivity extends AppCompatActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout._a_activity_splash_screen);
        new Thread() {
            public void run() {
                try {
                    sleep(2000);
                    _a_Splash_screenActivity.this.startActivity(new Intent(_a_Splash_screenActivity.this, _b_Select_CountryActivity.class));
                    _a_Splash_screenActivity.this.finish();
                } catch (Exception unused) {
                }
            }
        }.start();
    }
}
