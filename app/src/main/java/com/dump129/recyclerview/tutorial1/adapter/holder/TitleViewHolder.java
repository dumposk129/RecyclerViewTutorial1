package com.dump129.recyclerview.tutorial1.adapter.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.dump129.recyclerview.tutorial1.R;

/**
 * Created by Dump129 on 1/21/2017.
 */

public class TitleViewHolder extends RecyclerView.ViewHolder {
    public TextView tvTitle;

    public TitleViewHolder(View itemView) {
        super(itemView);
        tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
    }
}
