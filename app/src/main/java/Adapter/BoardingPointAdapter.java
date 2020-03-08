package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;
import fathorazi.id.ac.unuja.bus.R;
import model.BoardingPointModel;

public class BoardingPointAdapter extends RecyclerView.Adapter<BoardingPointAdapter.ViewHolder> {
    Context context;
    ArrayList<BoardingPointModel> models;
    int myPos = 5;

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView city;
        ImageView location;
        TextView time;

        public ViewHolder(View view) {
            super(view);
            this.city = (TextView) view.findViewById(R.id.city);
            this.time = (TextView) view.findViewById(R.id.time);
            this.location = (ImageView) view.findViewById(R.id.location);
        }
    }

    public BoardingPointAdapter(Context context2, ArrayList<BoardingPointModel> arrayList) {
        this.context = context2;
        this.models = arrayList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_boardingpoint, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        BoardingPointModel boardingPointModel = (BoardingPointModel) this.models.get(i);
        viewHolder.city.setText(boardingPointModel.getCity());
        viewHolder.time.setText(boardingPointModel.getTime());
        viewHolder.location.setImageResource(boardingPointModel.getLocation().intValue());
        if (this.myPos == i) {
            viewHolder.location.setImageResource(R.drawable.correct);
        } else {
            viewHolder.location.setImageResource(R.drawable.ic_markerlocation);
        }
        viewHolder.itemView.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
            }
        });
    }

    public int getItemCount() {
        return this.models.size();
    }
}
