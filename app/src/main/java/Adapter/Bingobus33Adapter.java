package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView;
import fathorazi.id.ac.unuja.bus.R;
import model.Bingobus33Model;

public class Bingobus33Adapter extends RecyclerView.Adapter<Bingobus33Adapter.ViewHolder> {
    Context context;
    ArrayList<Bingobus33Model> models;

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView sit1;

        public ViewHolder(View view) {
            super(view);
            this.sit1 = (ImageView) view.findViewById(R.id.sit1);
        }
    }

    public Bingobus33Adapter(Context context2, ArrayList<Bingobus33Model> arrayList) {
        this.context = context2;
        this.models = arrayList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_busbooking, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.sit1.setImageResource(((Bingobus33Model) this.models.get(i)).getSit1().intValue());
    }

    public int getItemCount() {
        return this.models.size();
    }
}
