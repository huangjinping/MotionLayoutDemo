package com.hope.myapplication.adapter;

/**
 * author Created by harrishuang on 2021/12/27.
 * email : huangjinping1000@163.com
 */
public class MotionItem {
    private String title;
    private int index;

    public MotionItem(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
