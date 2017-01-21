package com.dump129.recyclerview.tutorial1.adapter.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dump129.recyclerview.tutorial1.R;

/**
 * Created by Dump129 on 1/21/2017.
 */

public class SectionViewHolder extends RecyclerView.ViewHolder {
    public LinearLayout layoutSectionContainer;
    public TextView tvSection;

    public SectionViewHolder(View itemView) {
        super(itemView);
        layoutSectionContainer = (LinearLayout) itemView.findViewById(R.id.layout_section_container);
        tvSection = (TextView) itemView.findViewById(R.id.tvSection);
    }
}
