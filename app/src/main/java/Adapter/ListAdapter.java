package Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;
import fathorazi.id.ac.unuja.bus.BingoBusBookingDetailActivity;
import fathorazi.id.ac.unuja.bus.BingoBusBookingHistoryActivity;
import fathorazi.id.ac.unuja.bus.BingoBusYourTicketBookedActivity;
import fathorazi.id.ac.unuja.bus.Bingobus24Activity;
import fathorazi.id.ac.unuja.bus.Bingobus27Activity;
import fathorazi.id.ac.unuja.bus.Bingobus28Activity;
import fathorazi.id.ac.unuja.bus.Bingobus31Activity;
import fathorazi.id.ac.unuja.bus.Bingobus32Activity;
import fathorazi.id.ac.unuja.bus.Bingobus33Activity;
import fathorazi.id.ac.unuja.bus.Bingobus7Activity;
import fathorazi.id.ac.unuja.bus.Bingobus_Edit_MobileActivity;
import fathorazi.id.ac.unuja.bus.Bingobus_Last_StepActivity;
import fathorazi.id.ac.unuja.bus.Bingobus_Select_CountryActivity;
import fathorazi.id.ac.unuja.bus.Bingobus_mobileverificationActivity;
import fathorazi.id.ac.unuja.bus.Bingobus_walkthruoghActivity;
import fathorazi.id.ac.unuja.bus.Bus_result1Activity;
import fathorazi.id.ac.unuja.bus.R;
import fathorazi.id.ac.unuja.bus.Splash_screenActivity;
import model.ListModel;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    Context context;
    ArrayList<ListModel> models;

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView list;

        public ViewHolder(View view) {
            super(view);
            this.list = (TextView) view.findViewById(R.id.list);
        }
    }

    public ListAdapter(Context context2, ArrayList<ListModel> arrayList) {
        this.context = context2;
        this.models = arrayList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_recyclerview, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, final int i) {
        viewHolder.list.setText(((ListModel) this.models.get(i)).getList());
        viewHolder.itemView.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (i == 0) {
                    ListAdapter.this.context.startActivity(new Intent(ListAdapter.this.context, Splash_screenActivity.class));
                } else if (i == 1) {
                    ListAdapter.this.context.startActivity(new Intent(ListAdapter.this.context, Bingobus_Select_CountryActivity.class));
                } else if (i == 2) {
                    ListAdapter.this.context.startActivity(new Intent(ListAdapter.this.context, Bingobus_walkthruoghActivity.class));
                } else if (i == 3) {
                    ListAdapter.this.context.startActivity(new Intent(ListAdapter.this.context, Bingobus_mobileverificationActivity.class));
                } else if (i == 4) {
                    ListAdapter.this.context.startActivity(new Intent(ListAdapter.this.context, Bingobus_Edit_MobileActivity.class));
                } else if (i == 5) {
                    ListAdapter.this.context.startActivity(new Intent(ListAdapter.this.context, Bingobus24Activity.class));
                } else if (i == 6) {
                    ListAdapter.this.context.startActivity(new Intent(ListAdapter.this.context, Bingobus7Activity.class));
                } else if (i == 7) {
                    ListAdapter.this.context.startActivity(new Intent(ListAdapter.this.context, Bus_result1Activity.class));
                } else if (i == 8) {
                    ListAdapter.this.context.startActivity(new Intent(ListAdapter.this.context, Bingobus33Activity.class));
                } else if (i == 9) {
                    ListAdapter.this.context.startActivity(new Intent(ListAdapter.this.context, Bingobus27Activity.class));
                } else if (i == 10) {
                    ListAdapter.this.context.startActivity(new Intent(ListAdapter.this.context, Bingobus28Activity.class));
                } else if (i == 11) {
                    ListAdapter.this.context.startActivity(new Intent(ListAdapter.this.context, Bingobus31Activity.class));
                } else if (i == 12) {
                    ListAdapter.this.context.startActivity(new Intent(ListAdapter.this.context, Bingobus32Activity.class));
                } else if (i == 13) {
                    ListAdapter.this.context.startActivity(new Intent(ListAdapter.this.context, Bingobus_Last_StepActivity.class));
                } else if (i == 14) {
                    ListAdapter.this.context.startActivity(new Intent(ListAdapter.this.context, BingoBusBookingDetailActivity.class));
                } else if (i == 15) {
                    ListAdapter.this.context.startActivity(new Intent(ListAdapter.this.context, BingoBusYourTicketBookedActivity.class));
                } else if (i == 16) {
                    ListAdapter.this.context.startActivity(new Intent(ListAdapter.this.context, BingoBusBookingHistoryActivity.class));
                }
            }
        });
    }

    public int getItemCount() {
        return this.models.size();
    }
}
