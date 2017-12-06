package rmutsb.mook.chatchon.makingfavorcoffee.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import rmutsb.mook.chatchon.makingfavorcoffee.R;

/**
 * Created by Acer on 6/12/2560.
 */

public class EspressoFragment extends Fragment{

    //    Explicit
    private String[] loginString;

    public static EspressoFragment espressoInstance(String[] loginString){

        EspressoFragment EspressoFragment = new EspressoFragment();
        Bundle bundle = new Bundle();
        bundle.putStringArray("Login", loginString);
        EspressoFragment.setArguments(bundle);


        return EspressoFragment ;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Get Value From Arument

        loginString = getArguments().getStringArray("Login");
        for (int i=0; i<loginString.length; i+=1){
            Log.d("6DecV1", "LoinString[" + i + "] ==>" + loginString[i]);
        }



    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_espresso, container, false);

        return view;
    }
}
