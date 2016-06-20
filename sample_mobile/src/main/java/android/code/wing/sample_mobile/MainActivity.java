package android.code.wing.sample_mobile;

import android.code.wing.baseapp.base.BaseFragmentActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;

public class MainActivity extends BaseFragmentActivity{

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
