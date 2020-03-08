package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import fathorazi.id.ac.unuja.bus.R;
import model.Bingobus7Model;

public class Bingobus7Adapter extends RecyclerView.Adapter<Bingobus7Adapter.ViewHolder> {
    Context context;
    ArrayList<Bingobus7Model> models;

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView acsleeper;
        CardView bus_booking;
        ImageView location;

        public ViewHolder(View view) {
            super(view);
            this.acsleeper = (TextView) view.findViewById(R.id.acsleeper);
            this.location = (ImageView) view.findViewById(R.id.location);
            this.bus_booking = (CardView) view.findViewById(R.id.bus_booking);
        }
    }

    public Bingobus7Adapter(Context context2, ArrayList<Bingobus7Model> arrayList) {
        this.context = context2;
        this.models = arrayList;
    }


    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_bingobus7, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.acsleeper.setText(((Bingobus7Model) this.models.get(i)).getAcsleeper());
        if (i == 0) {
            viewHolder.location.setVisibility(View.GONE);
        }
        if (i == 2) {
            viewHolder.location.setVisibility(View.GONE);
        }
        if (i == 3) {
            viewHolder.location.setVisibility(View.GONE);
        }
        if (i == 4) {
            viewHolder.location.setVisibility(View.GONE);
        }
        if (i == 5) {
            viewHolder.location.setVisibility(View.GONE);
        }
        if (i == 6) {
            viewHolder.location.setVisibility(View.GONE);
        }
    }

    public int getItemCount() {
        return this.models.size();
    }
}
