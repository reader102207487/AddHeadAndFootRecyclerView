package com.qffweather.android.myrecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * 给ricyclerView添加头布局和脚布局，给自己的adapter一个装饰类
 * 参考：http://blog.csdn.net/lmj623565791/article/details/51854533（鸿洋博客）
 */
public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMain;
    private ArrayList<String> datas;
    private RvAdapter rvAdapter;
    private HeaderAndFooterWrapper mHeaderAndFooterWrapper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvMain = (RecyclerView) findViewById(R.id.rv_main);
        initData();
        rvMain.setLayoutManager(new GridLayoutManager(this,2));
        rvAdapter = new RvAdapter(this, datas);
        initHeaderAndFooter();
        rvMain.setAdapter(mHeaderAndFooterWrapper);
    }

    private void initHeaderAndFooter() {
        mHeaderAndFooterWrapper = new HeaderAndFooterWrapper(rvAdapter);
        TextView t1 = new TextView(this);
        t1.setText("Header 1");
        TextView t2 = new TextView(this);
        t2.setText("Header 2");
        TextView t3 = new TextView(this);
        t3.setText("Header 3");
        mHeaderAndFooterWrapper.addHeaderView(t1);
        mHeaderAndFooterWrapper.addHeaderView(t2);
        mHeaderAndFooterWrapper.addFootView(t3);
    }

    private void initData() {
        datas = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            datas.add("强壮的小强");
        }
    }
}
