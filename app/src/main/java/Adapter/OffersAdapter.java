package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;
import fathorazi.id.ac.unuja.bus.R;
import model.OffersModel;

public class OffersAdapter extends RecyclerView.Adapter<OffersAdapter.ViewHolder> {
    Context context;
    ArrayList<OffersModel> models;

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView poster;

        public ViewHolder(View view) {
            super(view);
            this.poster = (ImageView) view.findViewById(R.id.poster);
        }
    }

    public OffersAdapter(Context context2, ArrayList<OffersModel> arrayList) {
        this.context = context2;
        this.models = arrayList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_offers, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.poster.setImageResource(((OffersModel) this.models.get(i)).getPoster().intValue());
    }

    public int getItemCount() {
        return this.models.size();
    }
}
