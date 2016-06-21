package com.code.wing.sample_mobile;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.code.wing.sample_mobile.base.AppFragment;

import butterknife.BindView;

/**
 * @date 2016/6/21 0021
 * @author Wing.Zhong
 * @Description TODO
 * @version
 */
public class Fragment1 extends AppFragment {

    @BindView(R.id.tv_1)
    public TextView tv_1;
    @Override
    protected void initViews(View view, Bundle savedInstanceState) {
        tv_1.setText("hehehehee Fragment1");
        getHoldingActivity().setTitle("Fragment1");
        /**默认为空，需要时重新给值*/
        setSubTitle("副标题");
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_test;
    }


}
