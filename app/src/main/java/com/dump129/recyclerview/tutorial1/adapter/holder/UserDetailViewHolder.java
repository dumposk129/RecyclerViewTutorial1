package com.dump129.recyclerview.tutorial1.adapter.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.dump129.recyclerview.tutorial1.R;

/**
 * Created by Dump129 on 1/20/2017.
 */

public class UserDetailViewHolder extends RecyclerView.ViewHolder{
    public TextView tvUserName;
    public UserDetailViewHolder(View itemView) {
        super(itemView);
        tvUserName = (TextView) itemView.findViewById(R.id.tvUserName);
    }
}
