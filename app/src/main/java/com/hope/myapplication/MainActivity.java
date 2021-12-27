package com.hope.myapplication;

import android.os.Bundle;

import com.hope.myapplication.adapter.MainAdapter;
import com.hope.myapplication.adapter.MotionItem;
import com.hope.myapplication.adapter.OnItemClickListener;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {


    private MainAdapter mainAdapter;
    private List<MotionItem> dataList;
    private RecyclerView rechome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rechome = findViewById(R.id.rechome);
        dataList = new ArrayList<>();
        dataList.add(new MotionItem("Motion直线"));
        mainAdapter = new MainAdapter(dataList, new OnItemClickListener() {
            @Override
            public void onClick(String name, int position) {
                onMotionLayout(name, position);
            }
        });
        rechome.setLayoutManager(new LinearLayoutManager(this));
        rechome.setAdapter(mainAdapter);
    }

    public void onMotionLayout(String name, int position) {
        switch (position) {
            case 0:
                MotionLayoutActivity.startAction(this);
                break;
        }
    }
}