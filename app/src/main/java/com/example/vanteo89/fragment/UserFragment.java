package com.example.vanteo89.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.vanteo89.contacts.R;

/**
 * Created by vanteo89 on 7/22/2015.
 */
public class UserFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.user_fragment,container,false);
        TextView textView= (TextView) view.findViewById(R.id.text);
        textView.setText(getArguments().getString("info"));
        return view;
    }
}
