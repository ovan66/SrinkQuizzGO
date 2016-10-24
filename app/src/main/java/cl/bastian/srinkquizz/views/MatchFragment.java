package cl.bastian.srinkquizz.views;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import cl.bastian.srinkquizz.R;
import cl.bastian.srinkquizz.data.MatchResult;


public class MatchFragment extends Fragment {

    private TextInputEditText userEt, loverEt;
    private RadioGroup radioGroup;

    public MatchFragment() {
        // Required empty public constructor
    }

    public static MatchFragment newInstance() {
        return new MatchFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_match, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        userEt = (TextInputEditText) view.findViewById(R.id.userNameEt);
        loverEt = (TextInputEditText) view.findViewById(R.id.loverNameEt);
        radioGroup = (RadioGroup) view.findViewById(R.id.quarterRg);

        Button button = (Button) view.findViewById(R.id.sendBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = userEt.getText().toString();
                String lover = loverEt.getText().toString();
                int radioBtn = radioGroup.getCheckedRadioButtonId();
                String quarter = "";
                if (radioBtn != -1);
                    RadioButton radioButton = (RadioButton) radioGroup.findViewById(radioBtn);
                    quarter = radioButton.getText().toString();
                MatchResult matchResult = new MatchResult(user, lover, quarter, getContext());
                AlertDialog.Builder dialog = new AlertDialog.Builder(getContext());
                dialog.setMessage(matchResult.result());
                dialog.show();

            }
        });

    }


}
