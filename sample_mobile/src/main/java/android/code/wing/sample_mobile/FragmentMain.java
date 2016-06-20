package android.code.wing.sample_mobile;

import android.code.wing.baseapp.base.BaseFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Administrator on 2016/6/20 0020.
 */
public class FragmentMain extends BaseFragment {

    @Override
    protected void initViews(View view, Bundle savedInstanceState) {
        view.findViewById(R.id.btn_single_fragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Test4SingleFragmentActivity.class);
                startActivity(intent);
            }
        });
        view.findViewById(R.id.btn_mult_fragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Test4MultFragmentActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.main_fragment;
    }
}
