package com.cdac.aaron.anilproject;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class ResultPresentFragment extends Fragment {

    TextView textViewPresentValue, textViewPresentValue2, textViewFV, textViewTP,textViewTI;
    Double numberOfPeriod, startAmount, interestRate, periodicDeposit;
    String switchBegEnd;
    ArrayList<Column> columnData;

    public ResultPresentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_result_present, container, false);

        textViewPresentValue = (TextView)view.findViewById(R.id.textViewPresentValue);
        textViewPresentValue2 = (TextView)view.findViewById(R.id.textViewPresentValue2);
        textViewFV = (TextView)view.findViewById(R.id.textViewFV);
        textViewTP = (TextView)view.findViewById(R.id.textViewTP);
        textViewTI = (TextView)view.findViewById(R.id.textViewTI);

        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("dataPresent", Context.MODE_PRIVATE);
        numberOfPeriod=Double.parseDouble(sharedPreferences.getString("numberOfPeriod",""));
        startAmount=Double.parseDouble(sharedPreferences.getString("startAmount",""));
        interestRate=Double.parseDouble(sharedPreferences.getString("interestRate",""));
        periodicDeposit=Double.parseDouble(sharedPreferences.getString("periodicDeposit",""));
        switchBegEnd = sharedPreferences.getString("switchBegEnd","");

        if(switchBegEnd=="end")
            columnData= SchedulerPresent.scheduleEnd(numberOfPeriod,interestRate,periodicDeposit);
        else
            columnData= SchedulerPresent.scheduleBegaining(numberOfPeriod,interestRate,periodicDeposit);

        textViewPresentValue.setText(String.format("$%.2f",(columnData.get(numberOfPeriod.intValue()-1).getEndBalance())/Math.pow((1+(interestRate/100)),numberOfPeriod.intValue())));
        textViewPresentValue2.setText(String.format("$%.2f",columnData.get(numberOfPeriod.intValue()-1).getEndBalance()));
        textViewTP.setText(String.format("$%.2f",columnData.get(numberOfPeriod.intValue()-1).getEndPrincipal()));
        double sumInterest = 0;

        for (Column i : columnData)
        {
            sumInterest+=i.getInterest();
        }
        textViewTI.setText(String.format("$%.2f",sumInterest));



        return view;
    }

}
