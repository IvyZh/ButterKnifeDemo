package com.example.ivy.butterknifedemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.ButterKnife;

/**
 * Created by Ivy on 2016/7/15.
 */
public class BaseFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        TextView mRootView = new TextView(getActivity());
        mRootView.setText("Fragment");

        ButterKnife.bind(this,mRootView);//绑定Fragment

        return mRootView;
    }
}
