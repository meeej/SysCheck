package com.jimdoesnotgym.ms076.syscheck.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jimdoesnotgym.ms076.syscheck.R;

/**
 * Created by ms076 on 2017-07-18.
 */

public class HardwareFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.hardware_layout, container, false);
    }
}
