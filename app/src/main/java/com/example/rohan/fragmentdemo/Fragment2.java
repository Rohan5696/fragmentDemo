package com.example.rohan.fragmentdemo;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Rohan on 9/19/2018.
 */

public class Fragment2 extends Fragment {

    private static TextView mTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.two_fragment, container, false);
        mTextView = (TextView) view.findViewById(R.id.textChanged);
        return view;
    }

    public void changeTextProperties(String text) {
        mTextView.setText(text);
    }

}
