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
public class HorizontalTrueFragment extends Fragment {

    private TextView myTextView;

    public HorizontalTrueFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_horizontal_true, container, false);
        myTextView = (TextView) view.findViewById(R.id.nombre);
        myTextView.append("hola");
        return view;
    }
    private void foo(){
        myTextView.append("Adios");
    }

}
