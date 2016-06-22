package com.example.lopsan.app2.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lopsan.app2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class VerticalTrueFragment extends Fragment {

    private TextView textito;

    public VerticalTrueFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_vertical_true, container, false);
        textito = (TextView) view.findViewById(R.id.no);
        textito.append("textito");
        return view;
    }

}
