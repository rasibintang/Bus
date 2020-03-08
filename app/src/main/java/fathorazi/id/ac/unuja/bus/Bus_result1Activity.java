package fathorazi.id.ac.unuja.bus;

import Adapter.Bingobus_Result1Adapter;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import model.Bingobus_Result1Model;

public class Bus_result1Activity extends AppCompatActivity {
    private Bingobus_Result1Adapter bingobus_result1Adapter;
    private ArrayList<Bingobus_Result1Model> bingobus_result1Models;
    private RecyclerView recyclerView;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_bus_result1);
        this.recyclerView = (RecyclerView) findViewById(R.id.recycle_busresult);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.recyclerView.setFocusableInTouchMode(false);
        this.recyclerView.setNestedScrollingEnabled(false);
        runAnimation(this.recyclerView);
    }

    private void runAnimation(RecyclerView recyclerView2) {
        Context context = recyclerView2.getContext();
        this.bingobus_result1Models = new ArrayList<>();
        this.bingobus_result1Models.add(new Bingobus_Result1Model("A/C Sleeper (2+1)"));
        this.bingobus_result1Models.add(new Bingobus_Result1Model("A/C Sleeper (2+1)"));
        this.bingobus_result1Models.add(new Bingobus_Result1Model("A/C Sleeper (2+1)"));
        this.bingobus_result1Models.add(new Bingobus_Result1Model("A/C Sleeper (2+1)"));
        this.bingobus_result1Models.add(new Bingobus_Result1Model("A/C Sleeper (2+1)"));
        this.bingobus_result1Models.add(new Bingobus_Result1Model("A/C Sleeper (2+1)"));
        this.bingobus_result1Models.add(new Bingobus_Result1Model("A/C Sleeper (2+1)"));
        LayoutAnimationController loadLayoutAnimation = AnimationUtils.loadLayoutAnimation(context, R.anim.layout_fall_down);
        this.bingobus_result1Adapter = new Bingobus_Result1Adapter(this, this.bingobus_result1Models);
        recyclerView2.setAdapter(this.bingobus_result1Adapter);
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
