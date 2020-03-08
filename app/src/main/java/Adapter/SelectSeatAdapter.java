package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView;
import fathorazi.id.ac.unuja.bus.R;
import model.SelectSeatModel;

public class SelectSeatAdapter extends RecyclerView.Adapter<SelectSeatAdapter.ViewHolder> {
    Context context;
    ArrayList<SelectSeatModel> models;

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView sit1;

        public ViewHolder(View view) {
            super(view);
            this.sit1 = (ImageView) view.findViewById(R.id.sit1);
        }
    }

    public SelectSeatAdapter(Context context2, ArrayList<SelectSeatModel> arrayList) {
        this.context = context2;
        this.models = arrayList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_busbooking, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.sit1.setImageResource(((SelectSeatModel) this.models.get(i)).getSit1().intValue());
    }

    public int getItemCount() {
        return this.models.size();
    }
}
