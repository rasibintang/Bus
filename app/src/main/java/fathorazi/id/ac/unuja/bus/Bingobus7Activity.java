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
import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import model.Bingobus7Model;

public class Bingobus7Activity extends AppCompatActivity {
    Animation animation;
    ImageView back;
    private Bingobus7Adapter bingobas7_adapter;
    private ArrayList<Bingobus7Model> bingobas7_models;
    TextView down;
    private RecyclerView recyclerView;

    /* renamed from: up */
    TextView f48up;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_bingobus7);
        this.back = (ImageView) findViewById(R.id.back);
        this.back.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Bingobus7Activity.this, Bingobus24Activity.class);
                Bingobus7Activity.this.finish();
                Bingobus7Activity.this.overridePendingTransition(R.anim.left_in, R.anim.right_out);
                Bingobus7Activity.this.startActivity(intent);
            }
        });
        this.f48up = (TextView) findViewById(R.id.up);
        this.down = (TextView) findViewById(R.id.down);
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("MyPref", 0);
        this.f48up.setText(sharedPreferences.getString("from", null));
        this.down.setText(sharedPreferences.getString("to", null));
        this.recyclerView = (RecyclerView) findViewById(R.id.recycler1);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.recyclerView.setFocusableInTouchMode(false);
        this.recyclerView.setNestedScrollingEnabled(false);
        runAnimation(this.recyclerView);
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
        Intent intent = new Intent(this, ListinwsActivity.class);
        finish();
        overridePendingTransition(R.anim.left_in, R.anim.right_out);
        startActivity(intent);
    }
}
