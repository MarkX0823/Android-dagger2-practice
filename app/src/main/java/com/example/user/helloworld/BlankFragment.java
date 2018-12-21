package com.example.user.helloworld;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import javax.inject.Inject;

public class BlankFragment extends Fragment implements Injectable {

    @Inject
    MyClass2 myClass2;

    @Inject
    MyClass3 myClass3;

    private TextView viewInfo;

    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        viewInfo = view.findViewById(R.id.view_info);

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    public void refresh() {
        viewInfo.setText(myClass3.toString());
    }
}
