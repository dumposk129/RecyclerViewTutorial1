package com.dump129.recyclerview.tutorial1.adapter.model;

/**
 * Created by Dump129 on 1/21/2017.
 */

public class SummaryItem extends BaseOrderDetailItem {
    private String name;
    private String price;

    public SummaryItem() {
        super(OrderDetailType.TYPE_SUMMARY);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
