package fathorazi.id.ac.unuja.bus;

import Adapter.ListAdapter;
import android.os.Bundle;
import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import model.ListModel;

public class ListinwsActivity extends AppCompatActivity {
    String[] list = {"1.Splash_screenActivity", "2.Bingobus_Select_CountryActivity", "3.Bingobus_walkthruoghActivity", "4.Bingobus_mobileverificationActivity", "5.Bingobus_Edit_MobileActivity", "6.Bingobus24Activity", "7.Bingobus7Activity", "8.Bus_result1Activity", "9.Bingobus33Activity", "10.Bingobus27Activity", "11.Bingobus28Activity", "12.Bingobus31Activity", "13.Bingobus32Activity", "14.Bingobus_Last_StepActivity", "15.BingoBusBookingDetailActivity", "16.BingoBusYourTicketBookedActivity", "17.BingoBusBookingHistoryActivity"};
    private ListAdapter listAdapter;
    private ArrayList<ListModel> listModels;
    private RecyclerView recyclerView;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_listinws);
        this.recyclerView = (RecyclerView) findViewById(R.id.List_recycle);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.recyclerView.setItemAnimator(new DefaultItemAnimator());
        this.listModels = new ArrayList<>();
        for (String listModel : this.list) {
            this.listModels.add(new ListModel(listModel));
        }
        this.listAdapter = new ListAdapter(this, this.listModels);
        this.recyclerView.setAdapter(this.listAdapter);
    }
}
