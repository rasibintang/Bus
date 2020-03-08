package fathorazi.id.ac.unuja.bus;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SplaceScreenWSActivity extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_splace_screen_ws);
        new Thread() {
            public void run() {
                try {
                    sleep(2000);
                    SplaceScreenWSActivity.this.startActivity(new Intent(SplaceScreenWSActivity.this, ListinwsActivity.class));
                    SplaceScreenWSActivity.this.finish();
                } catch (Exception unused) {
                }
            }
        }.start();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
    }
}
