package com.example.myanimations;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentTransaction;

public class Frag1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle save){
    View view = inflater.inflate(R.layout.fragment_frag1, container, false);
    Button fragbutton1 = (Button) view.findViewById(R.id.frag1_button);

    fragbutton1.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            FragmentTransaction fr = getFragmentManager().beginTransaction();
            fr.replace(R.id.fragment_container, new Frag2());
            fr.commit();
        }
    });
    return view;
    }

}