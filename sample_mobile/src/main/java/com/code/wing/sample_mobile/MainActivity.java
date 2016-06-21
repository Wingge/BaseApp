package com.code.wing.sample_mobile;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.code.wing.sample_mobile.base.AppActivity;

public class MainActivity extends AppActivity {

//    @Override
//    protected Fragment initOrRestoreFragment() {
//        return Fragment.instantiate(MainActivity.this,FragmentMain.class.getName());
//    }

    @Override
    protected void initViews(Bundle savedInstanceState) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
    }

    @Override
    protected Fragment initOrRestoreFragment(Bundle savedInstanceState) {
        return Fragment.instantiate(MainActivity.this,FragmentMain.class.getName());
    }
}
