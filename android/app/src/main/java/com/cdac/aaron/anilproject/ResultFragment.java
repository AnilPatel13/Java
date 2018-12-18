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


public class ResultFragment extends Fragment {

    TextView textViewFutureValue, textViewPV, textViewNOP, textViewIT, textViewPMT, textViewSI, textViewTI, textViewTP;
    Double numberOfPeriod, startAmount, interestRate, periodicDeposit;
    String switchBegEnd;
    ArrayList<Column> columnData;

    public ResultFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_result, container, false);

        textViewFutureValue = (TextView)view.findViewById(R.id.textViewFutureValue);
        textViewPV = (TextView)view.findViewById(R.id.textViewPV);
        textViewNOP = (TextView)view.findViewById(R.id.textViewNOP);
        textViewIT = (TextView)view.findViewById(R.id.textViewIY);
        textViewPMT = (TextView)view.findViewById(R.id.textViewPMT);
        textViewSI = (TextView)view.findViewById(R.id.textViewSI);
        textViewTI = (TextView)view.findViewById(R.id.textViewTI);
        textViewTP = (TextView)view.findViewById(R.id.textViewTP);

        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("data", Context.MODE_PRIVATE);
        numberOfPeriod=Double.parseDouble(sharedPreferences.getString("numberOfPeriod",""));
        startAmount=Double.parseDouble(sharedPreferences.getString("startAmount",""));
        interestRate=Double.parseDouble(sharedPreferences.getString("interestRate",""));
        periodicDeposit=Double.parseDouble(sharedPreferences.getString("periodicDeposit",""));
        switchBegEnd = sharedPreferences.getString("switchBegEnd","");

        if(switchBegEnd=="end")
            columnData= Scheduler.scheduleEnd(numberOfPeriod,startAmount,interestRate,periodicDeposit);
        else
            columnData= Scheduler.scheduleBegaining(numberOfPeriod,startAmount,interestRate,periodicDeposit);

        textViewFutureValue.setText(String.format("$%.2f",columnData.get(numberOfPeriod.intValue()-1).getEndBalance()));
        textViewPV.setText(String.format("$%.2f",(columnData.get(numberOfPeriod.intValue()-1).getEndBalance())/Math.pow((1+(interestRate/100)),numberOfPeriod.intValue())));
        textViewNOP.setText(numberOfPeriod.intValue()+" yr");
        textViewIT.setText(interestRate.intValue()+"%");
        textViewPMT.setText("$"+periodicDeposit.intValue()+"");
        textViewSI.setText("$"+startAmount.intValue()+"");
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
