package com.code.wing.sample_mobile;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.code.wing.sample_mobile.base.AppActivity;

/**
 * TODO
 */
public class Test4MultFragmentActivity extends AppActivity {

    @Override
    protected void initViews(Bundle savedInstanceState) {
        //start a new fragment for test
        addFragment(Fragment.instantiate(Test4MultFragmentActivity.this,Fragment1.class.getName()));
    }

    @Override
    protected Fragment initOrRestoreFragment(Bundle savedInstanceState) {
        //init fragment
        return Fragment.instantiate(Test4MultFragmentActivity.this,Fragment2.class.getName());
    }
}
