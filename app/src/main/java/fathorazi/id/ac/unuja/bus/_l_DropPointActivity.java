package fathorazi.id.ac.unuja.bus;

import Adapter.BoardingPointAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import model.BoardingPointModel;

public class _l_DropPointActivity extends AppCompatActivity {
    ImageView back;
    private BoardingPointAdapter boardingPointAdapter;
    private ArrayList<BoardingPointModel> boardingPointModels;
    String[] city = {"Chhani Jakatnaka, Baroda", "Tulsidham, manjalpur, Baroda", "Harni char rasta, Harni, Baroda"};
    Integer[] image = {Integer.valueOf(R.drawable.marker), Integer.valueOf(R.drawable.marker), Integer.valueOf(R.drawable.marker)};
    private RecyclerView recyclerView;
    String[] time = {"8:00 pm", "8:15 pm", "8:30 pm"};

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout._l_activity_droppoint);
        this.back = (ImageView) findViewById(R.id.back);
        this.back.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(_l_DropPointActivity.this, _i_SelectSeatActivity.class);
                _l_DropPointActivity.this.finish();
                _l_DropPointActivity.this.overridePendingTransition(R.anim.left_in, R.anim.right_out);
                _l_DropPointActivity.this.startActivity(intent);
            }
        });
        this.recyclerView = (RecyclerView) findViewById(R.id.boardingpontrecycler);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.recyclerView.setItemAnimator(new DefaultItemAnimator());
        this.boardingPointModels = new ArrayList<>();
        for (int i = 0; i < this.image.length; i++) {
            this.boardingPointModels.add(new BoardingPointModel(this.image[i], this.city[i], this.time[i]));
        }
        this.boardingPointAdapter = new BoardingPointAdapter(this, this.boardingPointModels);
        this.recyclerView.setAdapter(this.boardingPointAdapter);
    }

    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, ListinwsActivity.class));
        overridePendingTransition(R.anim.left_in, R.anim.right_out);
        finish();
    }
}
