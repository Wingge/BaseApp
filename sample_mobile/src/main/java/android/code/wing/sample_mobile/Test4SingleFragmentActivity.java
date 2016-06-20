package android.code.wing.sample_mobile;

import android.code.wing.baseapp.base.BaseFragmentActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by Administrator on 2016/6/20 0020.
 */
public class Test4SingleFragmentActivity extends BaseFragmentActivity {

    @Override
    protected void initViews(Bundle savedInstanceState) {
    }

    @Override
    protected Fragment initOrRestoreFragment(Bundle savedInstanceState) {
        return Fragment.instantiate(Test4SingleFragmentActivity.this,Fragment1.class.getName());
    }
}
