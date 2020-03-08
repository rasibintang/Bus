package fathorazi.id.ac.unuja.bus;

import Adapter.DropingPointAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import model.BoardingPointModel;

public class _m_DropPointActivity extends AppCompatActivity {
    ImageView back;
    private DropingPointAdapter boardingPointAdapter;
    private ArrayList<BoardingPointModel> boardingPointModels;
    TextView boardingtext;
    LinearLayout booknow;
    LinearLayout card_bottom;
    String[] city = {"Chhani Jakatnaka, Baroda", "Tulsidham, manjalpur, Baroda", "Harni char rasta, Harni, Baroda"};
    LinearLayout city1;
    Integer[] image = {Integer.valueOf(R.drawable.marker), Integer.valueOf(R.drawable.marker), Integer.valueOf(R.drawable.marker)};
    ImageView location1;
    private RecyclerView recyclerView;
    String[] time = {"8:00 pm", "8:15 pm", "8:30 pm"};

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_bingobus32);
        this.back = (ImageView) findViewById(R.id.back);
        this.back.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(_m_DropPointActivity.this, _l_DropPointActivity.class);
                _m_DropPointActivity.this.finish();
                _m_DropPointActivity.this.overridePendingTransition(R.anim.left_in, R.anim.right_out);
                _m_DropPointActivity.this.startActivity(intent);
            }
        });
        this.card_bottom = (LinearLayout) findViewById(R.id.card_bottom);
        this.booknow = (LinearLayout) findViewById(R.id.booknow);
        this.booknow.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(_m_DropPointActivity.this, _n_Last_StepActivity.class);
                _m_DropPointActivity.this.finish();
                _m_DropPointActivity.this.overridePendingTransition(R.anim.right_in, R.anim.left_out);
                _m_DropPointActivity.this.startActivity(intent);
            }
        });
        this.boardingtext = (TextView) findViewById(R.id.boardingtext);
        this.boardingtext.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(_m_DropPointActivity.this, _l_DropPointActivity.class);
                _m_DropPointActivity.this.finish();
                _m_DropPointActivity.this.overridePendingTransition(R.anim.right_in, R.anim.left_out);
                _m_DropPointActivity.this.startActivity(intent);
            }
        });
        this.recyclerView = (RecyclerView) findViewById(R.id.boardingpontrecycler);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.recyclerView.setItemAnimator(new DefaultItemAnimator());
        this.boardingPointModels = new ArrayList<>();
        for (int i = 0; i < this.image.length; i++) {
            this.boardingPointModels.add(new BoardingPointModel(this.image[i], this.city[i], this.time[i]));
        }
        this.boardingPointAdapter = new DropingPointAdapter(this, this.boardingPointModels, this.booknow);
        this.recyclerView.setAdapter(this.boardingPointAdapter);
        this.card_bottom.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(_m_DropPointActivity.this, _n_Last_StepActivity.class);
                _m_DropPointActivity.this.finish();
                _m_DropPointActivity.this.overridePendingTransition(R.anim.right_in, R.anim.left_out);
                _m_DropPointActivity.this.startActivity(intent);
            }
        });
    }

    public void onBackPressed() {
        Intent intent = new Intent(this, _l_DropPointActivity.class);
        finish();
        overridePendingTransition(R.anim.left_in, R.anim.right_out);
        startActivity(intent);
        super.onBackPressed();
    }
}
