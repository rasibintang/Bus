package fathorazi.id.ac.unuja.bus;

import Adapter.BusResult1Adapter;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import model.BusResult1Model;

public class _h_BusResultActivity extends AppCompatActivity {
    private BusResult1Adapter bus_result1Adapter;
    private ArrayList<BusResult1Model> bus_result1Models;
    private RecyclerView recyclerView;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout._h_activity_bus_result);
        this.recyclerView = (RecyclerView) findViewById(R.id.recycle_busresult);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.recyclerView.setFocusableInTouchMode(false);
        this.recyclerView.setNestedScrollingEnabled(false);
        runAnimation(this.recyclerView);
    }

    private void runAnimation(RecyclerView recyclerView2) {
        Context context = recyclerView2.getContext();
        this.bus_result1Models = new ArrayList<>();
        this.bus_result1Models.add(new BusResult1Model("A/C Sleeper (2+1)"));
        this.bus_result1Models.add(new BusResult1Model("A/C Sleeper (2+1)"));
        this.bus_result1Models.add(new BusResult1Model("A/C Sleeper (2+1)"));
        this.bus_result1Models.add(new BusResult1Model("A/C Sleeper (2+1)"));
        this.bus_result1Models.add(new BusResult1Model("A/C Sleeper (2+1)"));
        this.bus_result1Models.add(new BusResult1Model("A/C Sleeper (2+1)"));
        this.bus_result1Models.add(new BusResult1Model("A/C Sleeper (2+1)"));
        LayoutAnimationController loadLayoutAnimation = AnimationUtils.loadLayoutAnimation(context, R.anim.layout_fall_down);
        this.bus_result1Adapter = new BusResult1Adapter(this, this.bus_result1Models);
        recyclerView2.setAdapter(this.bus_result1Adapter);
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
