package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import fathorazi.id.ac.unuja.bus.R;
import model.BusResult1Model;

public class BusResult1Adapter extends RecyclerView.Adapter<BusResult1Adapter.ViewHolder> {
    Context context;
    ArrayList<BusResult1Model> models;

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView acsleeper;
        CardView cardView;

        public ViewHolder(View view) {
            super(view);
            this.acsleeper = (TextView) view.findViewById(R.id.acsleeper);
        }
    }

    public BusResult1Adapter(Context context2, ArrayList<BusResult1Model> arrayList) {
        this.context = context2;
        this.models = arrayList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_bus_result1, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.acsleeper.setText(((BusResult1Model) this.models.get(i)).getAcsleeper());
    }

    public int getItemCount() {
        return this.models.size();
    }
}
