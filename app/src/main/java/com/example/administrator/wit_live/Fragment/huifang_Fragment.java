package com.example.administrator.wit_live.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.wit_live.R;

public class huifang_Fragment extends Fragment {


    public static Fragment newInstance() {

        Bundle args = new Bundle();
        huifang_Fragment fragment = new huifang_Fragment();
        fragment.setArguments(args);
        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate= inflater.inflate(R.layout.fragment_huifang_, container, false);
        return inflate;
    }


}
