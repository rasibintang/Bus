package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;
import fathorazi.id.ac.unuja.bus.R;
import model.BookingHistoryModel;

public class BookingHistoryAdapter extends RecyclerView.Adapter<BookingHistoryAdapter.ViewHolder> {
    Context context;
    ArrayList<BookingHistoryModel> models;

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView rate;
        TextView ratenow;
        ImageView star;
        LinearLayout star_rating;

        public ViewHolder(View view) {
            super(view);
            this.star = (ImageView) view.findViewById(R.id.star);
            this.rate = (TextView) view.findViewById(R.id.rate);
            this.ratenow = (TextView) view.findViewById(R.id.ratenow);
            this.star_rating = (LinearLayout) view.findViewById(R.id.star_rating);
        }
    }

    public BookingHistoryAdapter(Context context2, ArrayList<BookingHistoryModel> arrayList) {
        this.context = context2;
        this.models = arrayList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_booking_history, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.star.setImageResource(((BookingHistoryModel) this.models.get(i)).getStar().intValue());
        viewHolder.rate.setText(((BookingHistoryModel) this.models.get(i)).getRate());
        if (i == 0) {
            viewHolder.ratenow.setVisibility(View.VISIBLE);
            viewHolder.star_rating.setVisibility(View.GONE);
        }
    }

    public int getItemCount() {
        return this.models.size();
    }
}
