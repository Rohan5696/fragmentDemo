package com.example.rohan.fragmentdemo;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Rohan on 9/19/2018.
 */

public class Fragment1 extends Fragment {

    private static EditText mEditText;

    OneFragmentListener activityCallback;


    public interface OneFragmentListener {
        public void onButtonClick(String text);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            activityCallback = (OneFragmentListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OneFragmentListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.one_fragment, container, false);

        mEditText = (EditText) view.findViewById(R.id.textOneFragment);
        mEditText.setText("clicked");
        mEditText.setVisibility(View.GONE);

        final Button button = (Button) view.findViewById(R.id.buttonChange);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonClicked(v);
            }
        });

        return view;
    }

    //Set the activityCallback to onButtonClick passing the text in the mEditText
    public void buttonClicked(View view) {
        activityCallback.onButtonClick(mEditText.getText().toString());
    }
}
