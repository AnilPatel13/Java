package com.cdac.aaron.anilproject;


import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.jjoe64.graphview.series.PointsGraphSeries;
import com.numetriclabz.numandroidcharts.ChartData;
import com.numetriclabz.numandroidcharts.LineChart;

import java.util.ArrayList;
import java.util.List;


public class GraphInterestFragment extends Fragment {

    GraphView graphInterest;
    LineChart lineChartInterest;
    Double numberOfPeriod, startAmount, interestRate, periodicDeposit;
    String switchBegEnd;
    ArrayList<Column> columnData;

    public GraphInterestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_graph_interest, container, false);

        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("data", Context.MODE_PRIVATE);
        numberOfPeriod=Double.parseDouble(sharedPreferences.getString("numberOfPeriod",""));
        startAmount=Double.parseDouble(sharedPreferences.getString("startAmount",""));
        interestRate=Double.parseDouble(sharedPreferences.getString("interestRate",""));
        periodicDeposit=Double.parseDouble(sharedPreferences.getString("periodicDeposit",""));
        switchBegEnd = sharedPreferences.getString("switchBegEnd","");

        graphInterest = (GraphView)view.findViewById(R.id.graph_interest);
        lineChartInterest = (LineChart)view.findViewById(R.id.line_chart_interest);
        lineChartInterest.setStepline(true);

        if(switchBegEnd=="end")
            columnData= Scheduler.scheduleEnd(numberOfPeriod,startAmount,interestRate,periodicDeposit);
        else
            columnData= Scheduler.scheduleBegaining(numberOfPeriod,startAmount,interestRate,periodicDeposit);
        DataPoint[] interestData1 = new DataPoint[numberOfPeriod.intValue()];
        List<ChartData> interestData2 = new ArrayList<>();


        for(int i=0; i<numberOfPeriod.intValue(); i++) {
            interestData1[i] = new DataPoint(i+1, columnData.get(i).getInterest());
            interestData2.add(new ChartData((float) columnData.get(i).getInterest(), (float) i + 1));
        }


        lineChartInterest.setData(interestData2);

        LineGraphSeries<DataPoint> lineSeries = new LineGraphSeries<>(interestData1);

        graphInterest.getViewport().setXAxisBoundsManual(true);
        graphInterest.getViewport().setYAxisBoundsManual(true);
        graphInterest.getViewport().setMinY(0);
        graphInterest.getViewport().setMinX(0);
        graphInterest.getViewport().setMaxY(1000);
        graphInterest.getViewport().setMaxX(12);

        graphInterest.addSeries(lineSeries);

        return view;
    }

}
