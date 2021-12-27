package com.hope.myapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hope.myapplication.R;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * author Created by harrishuang on 2021/12/27.
 * email : huangjinping1000@163.com
 */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    private List<MotionItem> dataList;
    private OnItemClickListener itemClickListener;

    public MainAdapter(List<MotionItem> dataList, OnItemClickListener itemClickListener) {
        this.dataList = dataList;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_motion, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MotionItem motionItem = dataList.get(position);
        String title = motionItem.getTitle() + "";
        holder.txtmotionname.setText(title);
        final int pos = position;
        holder.rootView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (itemClickListener != null) {
                    itemClickListener.onClick(title, pos);

                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        View rootView;
        TextView txtmotionname;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            rootView = itemView;
            txtmotionname = itemView.findViewById(R.id.txtmotionname);
        }
    }
}
