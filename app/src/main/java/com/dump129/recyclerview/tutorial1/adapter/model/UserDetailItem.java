package com.dump129.recyclerview.tutorial1.adapter.model;

/**
 * Created by Dump129 on 1/21/2017.
 */

public class UserDetailItem extends BaseOrderDetailItem {
    private String name;

    public UserDetailItem() {
        super(OrderDetailType.TYPE_USER_DETAIL);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
