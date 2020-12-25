package com.example.hoaquaadapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<HoaQua> arrHOaQua;
    HoaQuaAdapter adapter;
    TextView txvXeptheoten, txvXeptheogia;
    GridView lvHoaQua;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        anhXa();
        setUp();
        setClick();
    }


    private void init(){
        arrHOaQua=new ArrayList<>();

        arrHOaQua.add(new HoaQua("Táo Mỹ","Xuât xứ Mỹ",30.5f,3.5f,R.drawable.tao));
        arrHOaQua.add(new HoaQua("Chôm Chôm","Việt Nam",20.5f,4.5f,R.drawable.chomchom));
        arrHOaQua.add(new HoaQua("Chuối","Chuối Lùn",15.5f,4.0f,R.drawable.chuoi));
        arrHOaQua.add(new HoaQua("Đu Đủ","Nhà Trồng",10.0f,3.5f,R.drawable.dudu));
        arrHOaQua.add(new HoaQua("Lựu","Lựu Đỏ",40.5f,4.5f,R.drawable.luu));
        arrHOaQua.add(new HoaQua("Nhãn","Nhãn Lồng",20.0f,4.0f,R.drawable.nhan));
        arrHOaQua.add(new HoaQua("Nho","Không Hột",60.0f,5.0f,R.drawable.nho));

        adapter = new HoaQuaAdapter(this,0,arrHOaQua);
    }
    private void anhXa(){
        txvXeptheoten = findViewById(R.id.txvXeptheoten);
        txvXeptheogia = findViewById(R.id.txvXeptheogia);
        lvHoaQua=findViewById(R.id.lvHoaQua);
    }
    private void setUp(){
        txvXeptheoten.setTextColor(MainActivity.this.getResources().getColor(R.color.white));
        txvXeptheoten.setBackgroundResource(R.drawable.bg_chon_trai);
        txvXeptheogia.setTextColor(MainActivity.this.getResources().getColor((R.color.xam1)));
        txvXeptheogia.setBackground(null);

        lvHoaQua.setAdapter(adapter);
    }
    private void setClick(){
        txvXeptheoten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txvXeptheoten.setTextColor(MainActivity.this.getResources().getColor(R.color.white));
                txvXeptheoten.setBackgroundResource(R.drawable.bg_chon_trai);
                txvXeptheogia.setTextColor(MainActivity.this.getResources().getColor((R.color.xam1)));
                txvXeptheogia.setBackground(null);
            }
        });
        txvXeptheogia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txvXeptheogia.setTextColor(MainActivity.this.getResources().getColor(R.color.white));
                txvXeptheogia.setBackgroundResource(R.drawable.bg_chon_phai);
                txvXeptheoten.setTextColor(MainActivity.this.getResources().getColor((R.color.xam1)));
                txvXeptheoten.setBackground(null);
            }
        });
    }
}
