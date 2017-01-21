package com.dump129.recyclerview.tutorial1.adapter.model;

/**
 * Created by Dump129 on 1/21/2017.
 */

public class TotalItem extends BaseOrderDetailItem {
    private String totalPrice;

    public TotalItem() {
        super(OrderDetailType.TYPE_TOTAL);
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }
}
