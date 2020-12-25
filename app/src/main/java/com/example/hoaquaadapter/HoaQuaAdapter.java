package com.example.hoaquaadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import me.zhanghai.android.materialratingbar.MaterialRatingBar;

public class HoaQuaAdapter extends ArrayAdapter<HoaQua> {
    private Context ct;
    private ArrayList<HoaQua>arr;
    public HoaQuaAdapter(@NonNull Context context, int resource, @NonNull List<HoaQua> objects) {
        super(context, resource, objects);
        this.ct=context;
        this.arr= new ArrayList<>(objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView==null){
            LayoutInflater inflater=(LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.item_hoaqua,null);
        }
        if (arr.size()>0){
            HoaQua h =arr.get(position);
            ImageView imgAnh=convertView.findViewById(R.id.imgAnh);
            imgAnh.setImageResource(h.getAnh());

            TextView txvTenQua =convertView.findViewById(R.id.txvTenQua);
            txvTenQua.setText(h.getTen());

            TextView txvMoTa =convertView.findViewById(R.id.txvMoTa);
            txvMoTa.setText(h.getMota());

            TextView txvGia = convertView.findViewById(R.id.txvGia);
            txvGia.setText(""+h.getGia());

            MaterialRatingBar ChatLuong=convertView.findViewById(R.id.ChatLuong);
            ChatLuong.setRating(h.getChatluong());

        }
        return convertView;
    }
}


