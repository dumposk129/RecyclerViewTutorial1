package com.dump129.recyclerview.tutorial1.adapter.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.dump129.recyclerview.tutorial1.R;

/**
 * Created by Dump129 on 1/21/2017.
 */

public class OrderViewHolder extends RecyclerView.ViewHolder {
    public TextView tvOrderName;
    public TextView tvOrderDetail;
    public TextView tvOrderPrice;

    public OrderViewHolder(View itemView) {
        super(itemView);
        tvOrderName = (TextView) itemView.findViewById(R.id.tvOrderName);
        tvOrderDetail = (TextView) itemView.findViewById(R.id.tvOrderDetail);
        tvOrderPrice = (TextView) itemView.findViewById(R.id.tvOrderPrice);
    }
}
