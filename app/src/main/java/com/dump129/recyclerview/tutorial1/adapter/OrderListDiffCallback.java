package com.dump129.recyclerview.tutorial1.adapter;

import android.support.v7.util.DiffUtil;

import com.dump129.recyclerview.tutorial1.adapter.model.BaseOrderDetailItem;
import com.dump129.recyclerview.tutorial1.adapter.model.OrderItem;
import com.dump129.recyclerview.tutorial1.adapter.model.SectionItem;
import com.dump129.recyclerview.tutorial1.adapter.model.SummaryItem;
import com.dump129.recyclerview.tutorial1.adapter.model.TotalItem;

import java.util.List;

/**
 * Created by Dump129 on 1/22/2017.
 */

public class OrderListDiffCallback extends DiffUtil.Callback {
    private List<BaseOrderDetailItem> oldOrderItemList;
    private List<BaseOrderDetailItem> newOrderItemList;

    public OrderListDiffCallback(List<BaseOrderDetailItem> oldOrderItemList, List<BaseOrderDetailItem> newOrderItemList) {
        this.oldOrderItemList = oldOrderItemList;
        this.newOrderItemList = newOrderItemList;
    }

    @Override
    public int getOldListSize() {
        return oldOrderItemList != null ? oldOrderItemList.size() : 0;
    }

    @Override
    public int getNewListSize() {
        return newOrderItemList != null ? newOrderItemList.size() : 0;
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) { // check unique id from oldOrderItemList and newOrderItemList
        BaseOrderDetailItem newOrderDetailItem = newOrderItemList.get(newItemPosition);
        BaseOrderDetailItem oldOrderDetailItem = oldOrderItemList.get(newItemPosition);
        if (newOrderDetailItem.getType() == oldOrderDetailItem.getType()) {
            if (newOrderDetailItem instanceof SectionItem) {
                SectionItem newSectionItem = (SectionItem) newOrderDetailItem;
                SectionItem oldSectionItem = (SectionItem) oldOrderDetailItem;
                return newSectionItem.getSection().equals(oldSectionItem.getSection());

            } else if (newOrderDetailItem instanceof OrderItem) {
                OrderItem newOrderItem = (OrderItem) newOrderDetailItem;
                OrderItem oldOrderItem = (OrderItem) oldOrderDetailItem;
                return newOrderItem.getName().equals(oldOrderItem.getName());

            } else if (newOrderDetailItem instanceof SummaryItem) {
                SummaryItem newSummaryItem = (SummaryItem) newOrderDetailItem;
                SummaryItem oldSummaryItem = (SummaryItem) oldOrderDetailItem;
                return newSummaryItem.getName().equals(oldSummaryItem.getName());

            } else {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) { // check inside data from oldOrderItemList and newOrderItemList
        BaseOrderDetailItem newOrderDetailItem = newOrderItemList.get(newItemPosition);
        BaseOrderDetailItem oldOrderDetailItem = oldOrderItemList.get(newItemPosition);
        if (newOrderDetailItem.getType() == oldOrderDetailItem.getType()) {
            if (newOrderDetailItem instanceof SectionItem) {
                SectionItem newSectionItem = (SectionItem) newOrderDetailItem;
                SectionItem oldSectionItem = (SectionItem) oldOrderDetailItem;
                return newSectionItem.getSection().equals(oldSectionItem.getSection()) &&
                        newSectionItem.getBackgroundColor() == oldSectionItem.getBackgroundColor();

            } else if (newOrderDetailItem instanceof OrderItem) {
                OrderItem newOrderItem = (OrderItem) newOrderDetailItem;
                OrderItem oldOrderItem = (OrderItem) oldOrderDetailItem;
                return newOrderItem.getName().equals(oldOrderItem.getName()) &&
                        newOrderItem.getDetail().equals(oldOrderItem.getDetail()) &&
                        newOrderItem.getPrice().equals(oldOrderItem.getPrice());

            } else if (newOrderDetailItem instanceof SummaryItem) {
                SummaryItem newSummaryItem = (SummaryItem) newOrderDetailItem;
                SummaryItem oldSummaryItem = (SummaryItem) oldOrderDetailItem;
                return newSummaryItem.getName().equals(oldSummaryItem.getName()) &&
                        newSummaryItem.getPrice().equals(oldSummaryItem.getPrice());

            } else if (newOrderDetailItem instanceof TotalItem) {
                TotalItem newTotalItem = (TotalItem) newOrderDetailItem;
                TotalItem oldTotalItem = (TotalItem) oldOrderDetailItem;
                return newTotalItem.getTotalPrice().equals(oldTotalItem.getTotalPrice());

            } else {
                return true;
            }
        }
        return false;
    }
}
