package com.code.wing.sample_mobile;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.code.wing.sample_mobile.base.AppFragment;

/**
 * Created by Administrator on 2016/6/20 0020.
 */
public class Fragment2 extends AppFragment {

    @Override
    protected void initViews(View view, Bundle savedInstanceState) {
        ((TextView)view.findViewById(R.id.tv_1)).setText("hehehehee Fragment2");
        getHoldingActivity().setTitle("Fragment2");

    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_test;
    }
}
