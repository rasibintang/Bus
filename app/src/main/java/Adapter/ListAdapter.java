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
import fathorazi.id.ac.unuja.bus.R;
import fathorazi.id.ac.unuja.bus._a_Splash_screenActivity;
import fathorazi.id.ac.unuja.bus._b_Select_CountryActivity;
import fathorazi.id.ac.unuja.bus._c_walkthruoghActivity;
import fathorazi.id.ac.unuja.bus._d_mobileverificationActivity;
import fathorazi.id.ac.unuja.bus._e_Edit_MobileActivity;
import fathorazi.id.ac.unuja.bus._f_HomeActivity;
import fathorazi.id.ac.unuja.bus._g_BusResultActivity;
import fathorazi.id.ac.unuja.bus._h_BusResultActivity;
import fathorazi.id.ac.unuja.bus._i_SelectSeatActivity;
import fathorazi.id.ac.unuja.bus._j_FasilitasActivity;
import fathorazi.id.ac.unuja.bus._k_DetailPembayaranActivity;
import fathorazi.id.ac.unuja.bus._l_DropPointActivity;
import fathorazi.id.ac.unuja.bus._m_DropPointActivity;
import fathorazi.id.ac.unuja.bus._n_Last_StepActivity;
import fathorazi.id.ac.unuja.bus._o_YourTicketBookedActivity;
import fathorazi.id.ac.unuja.bus._p_BookingHistoryActivity;
import fathorazi.id.ac.unuja.bus._q_BookingDetailActivity;
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
                    ListAdapter.this.context.startActivity(new Intent(ListAdapter.this.context, _a_Splash_screenActivity.class));
                } else if (i == 1) {
                    ListAdapter.this.context.startActivity(new Intent(ListAdapter.this.context, _b_Select_CountryActivity.class));
                } else if (i == 2) {
                    ListAdapter.this.context.startActivity(new Intent(ListAdapter.this.context, _c_walkthruoghActivity.class));
                } else if (i == 3) {
                    ListAdapter.this.context.startActivity(new Intent(ListAdapter.this.context, _d_mobileverificationActivity.class));
                } else if (i == 4) {
                    ListAdapter.this.context.startActivity(new Intent(ListAdapter.this.context, _e_Edit_MobileActivity.class));
                } else if (i == 5) {
                    ListAdapter.this.context.startActivity(new Intent(ListAdapter.this.context, _f_HomeActivity.class));
                } else if (i == 6) {
                    ListAdapter.this.context.startActivity(new Intent(ListAdapter.this.context, _g_BusResultActivity.class));
                } else if (i == 7) {
                    ListAdapter.this.context.startActivity(new Intent(ListAdapter.this.context, _h_BusResultActivity.class));
                } else if (i == 8) {
                    ListAdapter.this.context.startActivity(new Intent(ListAdapter.this.context, _i_SelectSeatActivity.class));
                } else if (i == 9) {
                    ListAdapter.this.context.startActivity(new Intent(ListAdapter.this.context, _j_FasilitasActivity.class));
                } else if (i == 10) {
                    ListAdapter.this.context.startActivity(new Intent(ListAdapter.this.context, _k_DetailPembayaranActivity.class));
                } else if (i == 11) {
                    ListAdapter.this.context.startActivity(new Intent(ListAdapter.this.context, _l_DropPointActivity.class));
                } else if (i == 12) {
                    ListAdapter.this.context.startActivity(new Intent(ListAdapter.this.context, _m_DropPointActivity.class));
                } else if (i == 13) {
                    ListAdapter.this.context.startActivity(new Intent(ListAdapter.this.context, _n_Last_StepActivity.class));
                } else if (i == 14) {
                    ListAdapter.this.context.startActivity(new Intent(ListAdapter.this.context, _o_YourTicketBookedActivity.class));
                } else if (i == 15) {
                    ListAdapter.this.context.startActivity(new Intent(ListAdapter.this.context, _p_BookingHistoryActivity.class));
                } else if (i == 16) {
                    ListAdapter.this.context.startActivity(new Intent(ListAdapter.this.context, _q_BookingDetailActivity.class));
                }
            }
        });
    }

    public int getItemCount() {
        return this.models.size();
    }
}
