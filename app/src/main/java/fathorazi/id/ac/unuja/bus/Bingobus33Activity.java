package fathorazi.id.ac.unuja.bus;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Bingobus33Activity extends AppCompatActivity implements OnSeatSelected {
    private static final int COLUMNS = 5;
    ImageView back_press;
    private Builder builder;
    ImageView cancel;
    int count = 0;
    LinearLayout detailes;
    LinearLayout next;
    LinearLayout recipt;
    Dialog slideDialog;
    private TextView txtSeatSelected;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_bingobus33);
        this.txtSeatSelected = (TextView) findViewById(R.id.txt_seat_selected);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 50; i++) {
            int i2 = i % 5;
            if (i2 == 0 || i2 == 4) {
                arrayList.add(new EdgeItem(String.valueOf(i)));
            } else if (i2 == 1 || i2 == 3) {
                arrayList.add(new CenterItem(String.valueOf(i)));
            } else {
                arrayList.add(new EmptyItem(String.valueOf(i)));
            }
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.lst_items);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 5));
        recyclerView.setAdapter(new AirplaneAdapter(this, arrayList));
    }

    public void onSeatSelected(int i) {
        if (i == 2) {
            this.count += 720;
            this.txtSeatSelected.setText(String.valueOf(this.count));
        } else if (i == 1) {
            this.count -= 720;
            this.txtSeatSelected.setText(String.valueOf(this.count));
        }
    }

    public void onBackPressed() {
        Intent intent = new Intent(this, ListinwsActivity.class);
        finish();
        overridePendingTransition(R.anim.left_in, R.anim.right_out);
        startActivity(intent);
        super.onBackPressed();
    }
}
