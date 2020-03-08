package fathorazi.id.ac.unuja.bus;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class _e_Edit_MobileActivity extends AppCompatActivity {

    private TextView update;
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout._e_activity_edit_mobile);

        update = findViewById(R.id.update);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
