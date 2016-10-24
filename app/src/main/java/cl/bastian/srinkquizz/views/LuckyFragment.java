package cl.bastian.srinkquizz.views;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import cl.bastian.srinkquizz.R;
import cl.bastian.srinkquizz.data.LuckyAnswer;
import cl.bastian.srinkquizz.data.LuckyResult;


public class LuckyFragment extends Fragment {

    public LuckyFragment() {
        // Required empty public constructor
    }

    public static LuckyFragment newInstance() {
        return new LuckyFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lucky, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final CheckBox happy = (CheckBox) view.findViewById(R.id.happyCb);
        final CheckBox mood = (CheckBox) view.findViewById(R.id.moodCb);

        happy.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mood.setChecked(isChecked);
            }
        });

        Button button = (Button) view.findViewById(R.id.sendBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean hp = happy.isChecked();
                LuckyResult luckyResult = new LuckyResult(hp);
                AlertDialog.Builder dialog = new AlertDialog.Builder(getContext());
                dialog.setMessage(luckyResult.result());
                dialog.show();

            }
        });
    }
}
