package com.dump129.recyclerview.tutorial1.adapter.model;

/**
 * Created by Dump129 on 1/21/2017.
 */

public class TitleItem extends BaseOrderDetailItem {
    private String title;

    public TitleItem() {
        super(OrderDetailType.TYPE_TITLE);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
