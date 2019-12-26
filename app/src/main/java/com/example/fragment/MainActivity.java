package com.example.fragment;


import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends FragmentActivity {

    private beibeiFragment mFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void click_add(View view) {
        //获取Fragmentmanager
        FragmentManager manager = getSupportFragmentManager();
        //得到获取Fragmentmanager的事务管理对象
        FragmentTransaction ft = manager.beginTransaction();

        mFragment = new beibeiFragment();
        //传入两个值 分别为fragment添加到的位置和 fragment的对象
        ft.add(R.id.frame_layout, mFragment);
        ft.commit();
    }
    public void click_sub(View view) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();
        ft.remove( mFragment);
        ft.commit();
    }
}
