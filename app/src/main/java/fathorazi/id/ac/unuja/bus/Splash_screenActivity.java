package fathorazi.id.ac.unuja.bus;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Splash_screenActivity extends AppCompatActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_splash_screen);
        new Thread() {
            public void run() {
                try {
                    sleep(2000);
                    Splash_screenActivity.this.startActivity(new Intent(Splash_screenActivity.this, Bingobus_Select_CountryActivity.class));
                    Splash_screenActivity.this.finish();
                } catch (Exception unused) {
                }
            }
        }.start();
    }
}
