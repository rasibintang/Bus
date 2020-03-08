package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

import fathorazi.id.ac.unuja.bus.R;
import model.Country;

public class CustomSpinnerAdapter extends ArrayAdapter<Country> {
    private List<Country> data;

    private static class ViewHolder {
        public ImageView imgFlag;
        public TextView textCountry;

        private ViewHolder() {
        }

        public static ViewHolder createViewHolder(View view) {
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.imgFlag = (ImageView) view.findViewById(R.id.imgFlag);
            viewHolder.textCountry = (TextView) view.findViewById(R.id.textCountry);
            return viewHolder;
        }
    }

    public CustomSpinnerAdapter(Context context, List<Country> list) {
        super(context, R.layout.item_country, list);
        this.data = list;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return getView(i, view, viewGroup);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        Country country = (Country) this.data.get(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.item_country, viewGroup, false);
            view.setTag(ViewHolder.createViewHolder(view));
        }
        ViewHolder viewHolder = (ViewHolder) view.getTag();
        viewHolder.textCountry.setText(country.name);
        viewHolder.imgFlag.setImageResource(country.flag);
        return view;
    }

    public int getCount() {
        return this.data.size();
    }
}
