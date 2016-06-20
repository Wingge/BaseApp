package android.code.wing.sample_mobile;

import android.code.wing.baseapp.base.BaseFragmentActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by Administrator on 2016/6/20 0020.
 */
public class Test4MultFragmentActivity extends BaseFragmentActivity {

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
