package com.hope.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * author Created by harrishuang on 2021/12/24.
 * email : huangjinping1000@163.com
 *
 * https://blog.csdn.net/lcl130/article/details/109223541
 */
public class MotionLayoutActivity extends AppCompatActivity {

    public static void startAction(Context context) {
        Intent intent = new Intent(context, MotionLayoutActivity.class);
        context.startActivity(intent);
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motion);
    }
}
