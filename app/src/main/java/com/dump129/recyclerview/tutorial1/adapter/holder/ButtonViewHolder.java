package com.dump129.recyclerview.tutorial1.adapter.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.dump129.recyclerview.tutorial1.R;

/**
 * Created by Dump129 on 1/21/2017.
 */

public class ButtonViewHolder extends RecyclerView.ViewHolder {
    public Button btnPositive;
    public Button btnNegative;

    public ButtonViewHolder(View itemView) {
        super(itemView);
        btnPositive = (Button) itemView.findViewById(R.id.btnPositive);
        btnNegative = (Button) itemView.findViewById(R.id.btnNegative);
    }
}
