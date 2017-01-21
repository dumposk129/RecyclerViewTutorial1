package com.dump129.recyclerview.tutorial1.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dump129.recyclerview.tutorial1.R;
import com.dump129.recyclerview.tutorial1.adapter.holder.ButtonViewHolder;
import com.dump129.recyclerview.tutorial1.adapter.holder.EmptyViewHolder;
import com.dump129.recyclerview.tutorial1.adapter.holder.NoOrderViewHolder;
import com.dump129.recyclerview.tutorial1.adapter.holder.NoticeViewHolder;
import com.dump129.recyclerview.tutorial1.adapter.holder.OrderViewHolder;
import com.dump129.recyclerview.tutorial1.adapter.holder.SectionViewHolder;
import com.dump129.recyclerview.tutorial1.adapter.holder.SummaryViewHolder;
import com.dump129.recyclerview.tutorial1.adapter.holder.TitleViewHolder;
import com.dump129.recyclerview.tutorial1.adapter.holder.TotalViewHolder;
import com.dump129.recyclerview.tutorial1.adapter.holder.UserDetailViewHolder;
import com.dump129.recyclerview.tutorial1.adapter.model.BaseOrderDetailItem;
import com.dump129.recyclerview.tutorial1.adapter.model.ButtonItem;
import com.dump129.recyclerview.tutorial1.adapter.model.EmptyItem;
import com.dump129.recyclerview.tutorial1.adapter.model.NoOrderItem;
import com.dump129.recyclerview.tutorial1.adapter.model.NoticeItem;
import com.dump129.recyclerview.tutorial1.adapter.model.OrderDetailType;
import com.dump129.recyclerview.tutorial1.adapter.model.OrderItem;
import com.dump129.recyclerview.tutorial1.adapter.model.SectionItem;
import com.dump129.recyclerview.tutorial1.adapter.model.SummaryItem;
import com.dump129.recyclerview.tutorial1.adapter.model.TitleItem;
import com.dump129.recyclerview.tutorial1.adapter.model.TotalItem;
import com.dump129.recyclerview.tutorial1.adapter.model.UserDetailItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dump129 on 1/21/2017.
 */

public class OrderAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<BaseOrderDetailItem> orderDetailItemList;

    public OrderAdapter() {
        orderDetailItemList = new ArrayList<>();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == OrderDetailType.TYPE_USER_DETAIL) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_user_detail, parent, false);
            return new UserDetailViewHolder(view);

        } else if (viewType == OrderDetailType.TYPE_TITLE) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_title, parent, false);
            return new TitleViewHolder(view);

        } else if (viewType == OrderDetailType.TYPE_SECTION) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_section, parent, false);
            return new SectionViewHolder(view);

        } else if (viewType == OrderDetailType.TYPE_ORDER) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_order, parent, false);
            return new OrderViewHolder(view);

        } else if (viewType == OrderDetailType.TYPE_SUMMARY) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_summary, parent, false);
            return new SummaryViewHolder(view);

        } else if (viewType == OrderDetailType.TYPE_TOTAL) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_total, parent, false);
            return new TotalViewHolder(view);

        } else if (viewType == OrderDetailType.TYPE_NOTICE) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_notice, parent, false);
            return new NoticeViewHolder(view);

        } else if (viewType == OrderDetailType.TYPE_BUTTON) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_button, parent, false);
            return new ButtonViewHolder(view);

        } else if (viewType == OrderDetailType.TYPE_EMPTY) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_empty, parent, false);
            return new EmptyViewHolder(view);

        } else if (viewType == OrderDetailType.TYPE_NO_ORDER) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_no_order, parent, false);
            return new NoOrderViewHolder(view);

        }
        throw new NullPointerException("View Type " + viewType + " doesn't match with any existing order detail type");
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        BaseOrderDetailItem orderDetailItem = orderDetailItemList.get(position);
        if (holder instanceof UserDetailViewHolder) {
            UserDetailViewHolder userDetailViewHolder = (UserDetailViewHolder) holder;
            UserDetailItem userDetailItem = (UserDetailItem) orderDetailItem;
            setupUserDetail(userDetailViewHolder, userDetailItem);

        } else if (holder instanceof TitleViewHolder) {
            TitleViewHolder titleViewHolder = (TitleViewHolder) holder;
            TitleItem titleItem = (TitleItem) orderDetailItem;
            setupTitle(titleViewHolder, titleItem);

        } else if (holder instanceof SectionViewHolder) {
            SectionViewHolder sectionViewHolder = (SectionViewHolder) holder;
            SectionItem sectionItem = (SectionItem) orderDetailItem;
            setupSection(sectionViewHolder, sectionItem);

        } else if (holder instanceof OrderViewHolder) {
            OrderViewHolder orderViewHolder = (OrderViewHolder) holder;
            OrderItem orderItem = (OrderItem) orderDetailItem;
            setupOrder(orderViewHolder, orderItem);

        } else if (holder instanceof SummaryViewHolder) {
            SummaryViewHolder summaryViewHolder = (SummaryViewHolder) holder;
            SummaryItem summaryItem = (SummaryItem) orderDetailItem;
            setupSummary(summaryViewHolder, summaryItem);

        } else if (holder instanceof TotalViewHolder) {
            TotalViewHolder totalViewHolder = (TotalViewHolder) holder;
            TotalItem totalItem = (TotalItem) orderDetailItem;
            setupTotal(totalViewHolder, totalItem);

        } else if (holder instanceof NoticeViewHolder) {
            NoticeViewHolder noticeViewHolder = (NoticeViewHolder) holder;
            NoticeItem noticeItem = (NoticeItem) orderDetailItem;
            setupNotice(noticeViewHolder, noticeItem);

        } else if (holder instanceof ButtonViewHolder) {
            ButtonViewHolder buttonViewHolder = (ButtonViewHolder) holder;
            ButtonItem buttonItem = (ButtonItem) orderDetailItem;
            setupButton(buttonViewHolder, buttonItem);

        } else if (holder instanceof EmptyViewHolder) {
            EmptyViewHolder emptyViewHolder = (EmptyViewHolder) holder;
            EmptyItem emptyItem = (EmptyItem) orderDetailItem;
            setupEmpty(emptyViewHolder, emptyItem);

        } else if (holder instanceof NoOrderViewHolder) {
            NoOrderViewHolder noOrderViewHolder = (NoOrderViewHolder) holder;
            NoOrderItem noOrderItem = (NoOrderItem) orderDetailItem;
            setupNoOrder(noOrderViewHolder, noOrderItem);
        }
    }

    @Override
    public int getItemViewType(int position) {
        return orderDetailItemList.get(position).getType();
    }

    @Override
    public int getItemCount() {
        return orderDetailItemList.size();
    }

    public void setOrderItemList(List<BaseOrderDetailItem> orderDetailItemList) {
        this.orderDetailItemList = orderDetailItemList;
    }

    private void setupUserDetail(UserDetailViewHolder userDetailViewHolder, UserDetailItem userDetailItem) {
        userDetailViewHolder.tvUserName.setText(userDetailItem.getName());
    }

    private void setupTitle(TitleViewHolder titleViewHolder, TitleItem titleItem) {
        titleViewHolder.tvTitle.setText(titleItem.getTitle());
    }

    private void setupSection(SectionViewHolder sectionViewHolder, SectionItem sectionItem) {
        sectionViewHolder.tvSection.setText(sectionItem.getSection());
        sectionViewHolder.layoutSectionContainer.setBackgroundColor(sectionItem.getBackgroundColor());
    }

    private void setupOrder(OrderViewHolder orderViewHolder, OrderItem orderItem) {
        orderViewHolder.tvOrderName.setText(orderItem.getName());
        orderViewHolder.tvOrderDetail.setText(orderItem.getDetail());
        orderViewHolder.tvOrderPrice.setText(orderItem.getPrice());
    }

    private void setupSummary(SummaryViewHolder summaryViewHolder, SummaryItem summaryItem) {
        summaryViewHolder.tvSummaryName.setText(summaryItem.getName());
        summaryViewHolder.tvSummaryPrice.setText(summaryItem.getPrice());
    }

    private void setupTotal(TotalViewHolder totalViewHolder, TotalItem totalItem) {
        totalViewHolder.tvTotalPrice.setText(totalItem.getTotalPrice());
    }

    private void setupNotice(NoticeViewHolder noticeViewHolder, NoticeItem noticeItem) {
        // Nothing to do ...
    }

    private OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    private void setupButton(ButtonViewHolder buttonViewHolder, ButtonItem buttonItem) {
        buttonViewHolder.btnPositive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onItemClickListener != null) {
                    onItemClickListener.onPositiveButtonClick();
                }
            }
        });
        buttonViewHolder.btnNegative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onItemClickListener != null) {
                    onItemClickListener.onNegativeButtonClick();
                }
            }
        });
    }

    private void setupEmpty(EmptyViewHolder emptyViewHolder, EmptyItem emptyItem) {
        // Nothing to do ...
    }

    private void setupNoOrder(NoOrderViewHolder noOrderViewHolder, NoOrderItem noOrderItem) {
        // Nothing to do ...
    }

    public interface OnItemClickListener {
        void onPositiveButtonClick();

        void onNegativeButtonClick();
    }
}
