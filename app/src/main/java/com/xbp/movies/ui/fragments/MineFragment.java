package com.xbp.movies.ui.fragments;

import android.view.LayoutInflater;

import com.xbp.movies.R;
import com.xbp.movies.base.BaseFragment;
import com.xbp.movies.ui.views.MineView;

import butterknife.BindView;

/**
 * .......................................
 * 作者：薛宝鹏 on
 * 时间：2017/6/4 0004 15:02
 * 类作用：
 * 邮箱：13519297683@163.com
 * .......................................
 */

public class MineFragment extends BaseFragment {
    @BindView(R.id.fragment_mineView)
    MineView mineView;
    @Override
    protected void lazyFetchData() {

    }

    @Override
    protected void initView(LayoutInflater inflater) {

    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_mine;
    }
}
