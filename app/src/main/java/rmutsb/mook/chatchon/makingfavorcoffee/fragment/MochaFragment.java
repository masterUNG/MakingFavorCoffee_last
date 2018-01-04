package rmutsb.mook.chatchon.makingfavorcoffee.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;

import rmutsb.mook.chatchon.makingfavorcoffee.R;

/**
 * Created by Acer on 6/12/2560.
 */

public class MochaFragment extends Fragment{

    //    Explicit
    private String[] loginString;
    private RadioButton frappuccinoRadioButton, coldDrinnkRadioButton, hotDrinkRadioButton;
    private LinearLayout milkLinearLayout, frappePowderLinearLayout;
    private SeekBar espressoSeekBar, cocoSeekBar, milkSeekBar, frappeSeekBar;
    private TextView unitEspressoTextView, unitCocoTextView, unitMilkTextView, unitFrappeTextView;



    public static MochaFragment mochaInstance(String[] loginString){

        MochaFragment mochaFragment = new MochaFragment();
        Bundle bundle = new Bundle();
        bundle.putStringArray("Login", loginString);
        mochaFragment.setArguments(bundle);


        return mochaFragment ;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Get Value From Arument
        getValueFromArument();

        //Initial View
        initialView();

//        Cold Defaule
        coldDefaule();




        //frappuccino Controller
        frappuccinoController();

        //clodDrink
        clodDrinkController();


        //hotDrinkController
        hotDrinkController();

        //Espressp seekbar
        espresspSeekbar();

        //Coco seekbar
        cocoSeekbar();

        //Milk seekbar
        milkSeekbar();

        //Frappe seekbar
        frappeSeekbar();


    }//Main method


    //@SuppressLint("NewApi")
    private void espresspSeekbar() {
        //espressoSeekBar.setMin(1);
        espressoSeekBar.setMax(5);
        espressoSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                unitEspressoTextView.setText(Integer.toString(progress)+ " " + getString(R.string.shot));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    private void frappeSeekbar() {
        frappeSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    private void milkSeekbar() {
        milkSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    //@SuppressLint("NewApi")
    private void cocoSeekbar() {
        //cocoSeekBar.setMin(1);
        cocoSeekBar.setMax(5);
        cocoSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                unitCocoTextView.setText(Integer.toString(progress)+ " " + getString(R.string.teaspoons));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }



    private void coldDefaule() {
        coldDrinnkRadioButton.setChecked(true);
        unitEspressoTextView.setText("1" + getString(R.string.shot));
        unitCocoTextView.setText("1" + getString(R.string.teaspoons));
        unitMilkTextView.setText("1" + getString(R.string.teaspoons));
        unitFrappeTextView.setText("1" + getString(R.string.teaspoons));

    }

    private void hotDrinkController() {
        hotDrinkRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                milkLinearLayout.setVisibility(View.INVISIBLE);
                frappePowderLinearLayout.setVisibility(View.INVISIBLE);
            }
        });
    }

    private void clodDrinkController() {
        coldDrinnkRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //for divisble View
                milkLinearLayout.setVisibility(View.VISIBLE);
                frappePowderLinearLayout.setVisibility(View.VISIBLE);
            }
        });
    }

    private void frappuccinoController() {
        frappuccinoRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                milkLinearLayout.setVisibility(View.VISIBLE);
                frappePowderLinearLayout.setVisibility(View.VISIBLE);
            }
        });
    }

    private void initialView() {
        frappuccinoRadioButton = getView().findViewById(R.id.radfrappuccino);
        coldDrinnkRadioButton = getView().findViewById(R.id.radcolddrink);
        hotDrinkRadioButton = getView().findViewById(R.id.radhotdrink);
        milkLinearLayout = getView().findViewById(R.id.nMilk);
        frappePowderLinearLayout = getView().findViewById(R.id.linFrapp);

        espressoSeekBar = getView().findViewById(R.id.seekbarEspreeso);
        cocoSeekBar = getView().findViewById(R.id.seekCoco);
        milkSeekBar = getView().findViewById(R.id.seekBarMilk);
        frappeSeekBar = getView().findViewById(R.id.seekbarFrappe);

        unitEspressoTextView = getView().findViewById(R.id.txtUnitEspreeso);
        unitCocoTextView = getView().findViewById(R.id.txtUnitCoco);
        unitMilkTextView = getView().findViewById(R.id.txtUnitMilk);
        unitFrappeTextView = getView().findViewById(R.id.txtUnitFrappe);
    }

    private void getValueFromArument() {
        loginString = getArguments().getStringArray("Login");
        for (int i=0; i<loginString.length; i+=1){
            Log.d("6DecV1", "LoinString[" + i + "] ==>" + loginString[i]);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mocha, container, false);
        return view;
    }
}
