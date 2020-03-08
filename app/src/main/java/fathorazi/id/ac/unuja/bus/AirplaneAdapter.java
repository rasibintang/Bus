package fathorazi.id.ac.unuja.bus;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;

import androidx.recyclerview.widget.RecyclerView.ViewHolder;

public class AirplaneAdapter extends SelectableAdapter<ViewHolder> {
    private int count = 0;
    private Context mContext;
    private List<AbstractItem> mItems;
    private LayoutInflater mLayoutInflater;
    /* access modifiers changed from: private */
    public OnSeatSelected mOnSeatSelected;

    private static class CenterViewHolder extends ViewHolder {
        ImageView imgSeat;
        /* access modifiers changed from: private */
        public final ImageView imgSeatSelected;
        ImageView img_nomral_booked;

        public CenterViewHolder(View view) {
            super(view);
            this.imgSeat = (ImageView) view.findViewById(R.id.img_seat);
            this.imgSeatSelected = (ImageView) view.findViewById(R.id.img_seat_selected);
            this.img_nomral_booked = (ImageView) view.findViewById(R.id.img_nomral_booked);
        }
    }

    private static class EdgeViewHolder extends ViewHolder {
        ImageView imgSeat;
        /* access modifiers changed from: private */
        public final ImageView imgSeatSelected;
        ImageView img_nomral_booked;

        public EdgeViewHolder(View view) {
            super(view);
            this.imgSeat = (ImageView) view.findViewById(R.id.img_seat);
            this.imgSeatSelected = (ImageView) view.findViewById(R.id.img_seat_selected);
            this.img_nomral_booked = (ImageView) view.findViewById(R.id.img_nomral_booked);
        }
    }

    private static class EmptyViewHolder extends ViewHolder {
        public EmptyViewHolder(View view) {
            super(view);
        }
    }

    public AirplaneAdapter(Context context, List<AbstractItem> list) {
        this.mOnSeatSelected = (OnSeatSelected) context;
        this.mContext = context;
        this.mLayoutInflater = LayoutInflater.from(context);
        this.mItems = list;
    }

    public int getItemCount() {
        return this.mItems.size();
    }

    public int getItemViewType(int i) {
        return ((AbstractItem) this.mItems.get(i)).getType();
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new CenterViewHolder(this.mLayoutInflater.inflate(R.layout.list_item_seat, viewGroup, false));
        }
        if (i == 1) {
            return new EdgeViewHolder(this.mLayoutInflater.inflate(R.layout.list_item_seat, viewGroup, false));
        }
        return new EmptyViewHolder(new View(this.mContext));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        final int i2 = i;
        int type = ((AbstractItem) this.mItems.get(i2)).getType();
        int i3 = 4;
        if (type == 0) {
            CenterItem centerItem = (CenterItem) this.mItems.get(i2);
            CenterViewHolder centerViewHolder = (CenterViewHolder) viewHolder;
            if (i2 == 3 || i2 == 4 || i2 == 5 || i2 == 7 || i2 == 8 || i2 == 9 || i2 == 11 || i2 == 12 || i2 == 13 || i2 == 14 || i2 == 15 || i2 == 16 || i2 == 17 || i2 == 19 || i2 == 20 || i2 == 21 || i2 == 23 || i2 == 24 || i2 == 25 || i2 == 26) {
                centerViewHolder.imgSeat.setImageResource(R.drawable.brown_sit);
                centerViewHolder.imgSeatSelected.setImageResource(R.drawable.brown_sit);
            }
            centerViewHolder.imgSeat.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    if (i2 != 3 && i2 != 4 && i2 != 5 && i2 != 7 && i2 != 8 && i2 != 9 && i2 != 11 && i2 != 12 && i2 != 13 && i2 != 14 && i2 != 15 && i2 != 16 && i2 != 17 && i2 != 19 && i2 != 20 && i2 != 21 && i2 != 23 && i2 != 24 && i2 != 25 && i2 != 26) {
                        AirplaneAdapter.this.mOnSeatSelected.onSeatSelected(AirplaneAdapter.this.toggleSelection(i2));
                    }
                }
            });
            ImageView access$000 = centerViewHolder.imgSeatSelected;
            if (isSelected(i2)) {
                i3 = 0;
            }
            access$000.setVisibility(i3);
        } else if (type == 1) {
            EdgeItem edgeItem = (EdgeItem) this.mItems.get(i2);
            EdgeViewHolder edgeViewHolder = (EdgeViewHolder) viewHolder;
            if (i2 == 3 || i2 == 4 || i2 == 5 || i2 == 7 || i2 == 8 || i2 == 9 || i2 == 11 || i2 == 12 || i2 == 13 || i2 == 14 || i2 == 15 || i2 == 16 || i2 == 17 || i2 == 19 || i2 == 20 || i2 == 21 || i2 == 23 || i2 == 24 || i2 == 25 || i2 == 26) {
                edgeViewHolder.imgSeat.setImageResource(R.drawable.brown_sit);
                edgeViewHolder.imgSeatSelected.setImageResource(R.drawable.brown_sit);
            }
            edgeViewHolder.imgSeat.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    if (i2 != 3 && i2 != 4 && i2 != 5 && i2 != 7 && i2 != 8 && i2 != 9 && i2 != 11 && i2 != 12 && i2 != 13 && i2 != 14 && i2 != 15 && i2 != 16 && i2 != 17 && i2 != 19 && i2 != 20 && i2 != 21 && i2 != 23 && i2 != 24 && i2 != 25 && i2 != 26) {
                        AirplaneAdapter.this.mOnSeatSelected.onSeatSelected(AirplaneAdapter.this.toggleSelection(i2));
                    }
                }
            });
            ImageView access$200 = edgeViewHolder.imgSeatSelected;
            if (isSelected(i2)) {
                i3 = 0;
            }
            access$200.setVisibility(i3);
        }
    }
}
