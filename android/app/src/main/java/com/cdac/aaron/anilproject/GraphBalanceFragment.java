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


public class GraphBalanceFragment extends Fragment {

    GraphView graphBalance;
    LineChart lineChartBalance;
    Double numberOfPeriod, startAmount, interestRate, periodicDeposit;
    String switchBegEnd;
    ArrayList<Column> columnData;

    public GraphBalanceFragment() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_graph_balance, container, false);

        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("data",Context.MODE_PRIVATE);
        numberOfPeriod=Double.parseDouble(sharedPreferences.getString("numberOfPeriod",""));
        startAmount=Double.parseDouble(sharedPreferences.getString("startAmount",""));
        interestRate=Double.parseDouble(sharedPreferences.getString("interestRate",""));
        periodicDeposit=Double.parseDouble(sharedPreferences.getString("periodicDeposit",""));
        switchBegEnd = sharedPreferences.getString("switchBegEnd","");

        graphBalance = (GraphView)view.findViewById(R.id.graphBalance);
        lineChartBalance = (LineChart)view.findViewById(R.id.line_chart_balance);
        lineChartBalance.setStepline(true);

        if(switchBegEnd=="end")
            columnData= Scheduler.scheduleEnd(numberOfPeriod,startAmount,interestRate,periodicDeposit);
        else
            columnData= Scheduler.scheduleBegaining(numberOfPeriod,startAmount,interestRate,periodicDeposit);

        DataPoint[] balanceData1 = new DataPoint[numberOfPeriod.intValue()];
        List<ChartData> balanceData2 = new ArrayList<>();


        for(int i=0; i<numberOfPeriod.intValue(); i++) {
            balanceData1[i] = new DataPoint(i+1, columnData.get(i).getStartBalance());
            balanceData2.add(new ChartData((float) columnData.get(i).getStartBalance(), (float) i + 1));
        }


        lineChartBalance.setData(balanceData2);

        LineGraphSeries<DataPoint> lineSeries = new LineGraphSeries<>(balanceData1);
        PointsGraphSeries<DataPoint> pointSeries = new PointsGraphSeries<>(balanceData1);

        pointSeries.setShape(PointsGraphSeries.Shape.RECTANGLE);
        pointSeries.setColor(Color.RED);


        graphBalance.getViewport().setXAxisBoundsManual(true);
        graphBalance.getViewport().setYAxisBoundsManual(true);
        graphBalance.getViewport().setMinY(0);
        graphBalance.getViewport().setMinX(0);
        graphBalance.getViewport().setMaxY(6000);
        graphBalance.getViewport().setMaxX(12);

        graphBalance.addSeries(lineSeries);
        graphBalance.addSeries(pointSeries);



        return view;
    }

}
