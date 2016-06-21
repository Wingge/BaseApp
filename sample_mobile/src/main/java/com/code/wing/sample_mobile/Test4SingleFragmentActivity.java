package com.code.wing.sample_mobile;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.code.wing.sample_mobile.base.AppActivity;

/**
 * TODO
 */
public class Test4SingleFragmentActivity extends AppActivity {

    @Override
    protected void initViews(Bundle savedInstanceState) {
    }

    @Override
    protected Fragment initOrRestoreFragment(Bundle savedInstanceState) {
        return Fragment.instantiate(Test4SingleFragmentActivity.this,Fragment1.class.getName());
    }
}
