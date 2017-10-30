package rmutsb.mook.chatchon.makingfavorcoffee.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import rmutsb.mook.chatchon.makingfavorcoffee.R;
import rmutsb.mook.chatchon.makingfavorcoffee.ultility.MyAlertDialog;

/**
 * Created by WIN10-CREATOR on 13/9/2560.
 */

public class MainFragment extends Fragment{

    private String emailString, passwordString;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    } //onCreateView

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //Register Controller
        registerController();

//        SingIn Controller
        singInController();

    } //onActivityCreated

    private void singInController() {
        Button button = getView().findViewById(R.id.btnSingIn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText emailEditText = getView().findViewById(R.id.edtEmail);
                EditText passwordEditText = getView().findViewById(R.id.edtPassword);

                emailString = emailEditText.toString().trim();
                passwordString = passwordEditText.getText().toString().trim();

                if (emailString.equals("")|| passwordString.equals("")) {
                    MyAlertDialog myAlertDialog = new MyAlertDialog(getActivity());
                    myAlertDialog.myDialog(getResources().getString(R.string.message_haveSpace),
                            getResources().getString(R.string.message_haveSpace));
                } else {

                }



            } //onClick
        });
    }

    private void registerController() {
        TextView textView = getView().findViewById(R.id.txtNewRegister);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.contentFragmentMain, new RegisterFragment())
                        .addToBackStack(null)
                        .commit();

            }
        });


    }
}//Main Class
