package fathorazi.id.ac.unuja.bus;

import Adapter.Bingobus7Adapter;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import Adapter.RecyclerItemClickListener;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import model.Bingobus7Model;

public class _g_BusResultActivity extends AppCompatActivity {
    Animation animation;
    ImageView back;
    private Bingobus7Adapter bingobas7_adapter;
    private ArrayList<Bingobus7Model> bingobas7_models;
    TextView down;
    private RecyclerView recyclerView;

    TextView up;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_bingobus7);
        this.back = (ImageView) findViewById(R.id.back);
        this.back.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(_g_BusResultActivity.this, _f_HomeActivity.class);
                _g_BusResultActivity.this.finish();
                _g_BusResultActivity.this.overridePendingTransition(R.anim.left_in, R.anim.right_out);
                _g_BusResultActivity.this.startActivity(intent);
            }
        });
        this.up = (TextView) findViewById(R.id.up);
        this.down = (TextView) findViewById(R.id.down);
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("MyPref", 0);
        this.up.setText(sharedPreferences.getString("from", null));
        this.down.setText(sharedPreferences.getString("to", null));
        this.recyclerView = (RecyclerView) findViewById(R.id.recycler1);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.recyclerView.setFocusableInTouchMode(false);
        this.recyclerView.setNestedScrollingEnabled(false);
        runAnimation(this.recyclerView);

        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(_g_BusResultActivity.this, String.valueOf(position), Toast.LENGTH_SHORT).show();
                Intent lanjut = new Intent(getApplicationContext(), _i_SelectSeatActivity.class);
                startActivity(lanjut);
            }
        }));
    }

    private void runAnimation(RecyclerView recyclerView2) {
        Context context = recyclerView2.getContext();
        this.bingobas7_models = new ArrayList<>();
        this.bingobas7_models.add(new Bingobus7Model("A/C Sleeper (2+1)"));
        this.bingobas7_models.add(new Bingobus7Model("A/C Sleeper (2+1)"));
        this.bingobas7_models.add(new Bingobus7Model("A/C Sleeper (2+1)"));
        this.bingobas7_models.add(new Bingobus7Model("A/C Sleeper (2+1)"));
        this.bingobas7_models.add(new Bingobus7Model("A/C Sleeper (2+1)"));
        this.bingobas7_models.add(new Bingobus7Model("A/C Sleeper (2+1)"));
        this.bingobas7_models.add(new Bingobus7Model("A/C Sleeper (2+1)"));
        LayoutAnimationController loadLayoutAnimation = AnimationUtils.loadLayoutAnimation(context, R.anim.layout_fall_down);
        this.bingobas7_adapter = new Bingobus7Adapter(this, this.bingobas7_models);
        recyclerView2.setAdapter(this.bingobas7_adapter);
        recyclerView2.setLayoutAnimation(loadLayoutAnimation);
        recyclerView2.getAdapter().notifyDataSetChanged();
        recyclerView2.scheduleLayoutAnimation();
    }

    public void onBackPressed() {
        super.onBackPressed();
        finish();
        overridePendingTransition(R.anim.left_in, R.anim.right_out);

    }
}
