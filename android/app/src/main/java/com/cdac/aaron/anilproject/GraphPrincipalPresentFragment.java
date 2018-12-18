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


public class GraphPrincipalPresentFragment extends Fragment {

    GraphView graphPrincipal;
    LineChart lineChartPrincipal;
    Double numberOfPeriod, startAmount, interestRate, periodicDeposit;
    String switchBegEnd;
    ArrayList<Column> columnData;

    public GraphPrincipalPresentFragment() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_graph_principal, container, false);

        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("dataPresent", Context.MODE_PRIVATE);
        numberOfPeriod=Double.parseDouble(sharedPreferences.getString("numberOfPeriod",""));
        startAmount=Double.parseDouble(sharedPreferences.getString("startAmount",""));
        interestRate=Double.parseDouble(sharedPreferences.getString("interestRate",""));
        periodicDeposit=Double.parseDouble(sharedPreferences.getString("periodicDeposit",""));
        switchBegEnd = sharedPreferences.getString("switchBegEnd","");

        graphPrincipal = (GraphView)view.findViewById(R.id.graph_principal);
        lineChartPrincipal = (LineChart)view.findViewById(R.id.line_chart_principal);
        lineChartPrincipal.setStepline(true);

        if(switchBegEnd=="end")
            columnData= SchedulerPresent.scheduleEnd(numberOfPeriod,interestRate,periodicDeposit);
        else
            columnData= SchedulerPresent.scheduleBegaining(numberOfPeriod,interestRate,periodicDeposit);

        DataPoint[] principalData1 = new DataPoint[numberOfPeriod.intValue()];
        List<ChartData> principalData2 = new ArrayList<>();

        for(int i=0; i<numberOfPeriod.intValue(); i++) {
            principalData1[i] = new DataPoint(i, columnData.get(i).getStartPrincipal());
            principalData2.add(new ChartData((float) columnData.get(i).getStartPrincipal(), (float) i + 1));
        }
        lineChartPrincipal.setData(principalData2);

        LineGraphSeries<DataPoint> lineSeries = new LineGraphSeries<>(principalData1);
        PointsGraphSeries<DataPoint> pointSeries = new PointsGraphSeries<>(principalData1);

        pointSeries.setShape(PointsGraphSeries.Shape.RECTANGLE);
        pointSeries.setColor(Color.RED);


        graphPrincipal.getViewport().setXAxisBoundsManual(true);
        graphPrincipal.getViewport().setYAxisBoundsManual(true);
        graphPrincipal.getViewport().setMinY(0);
        graphPrincipal.getViewport().setMinX(0);
        graphPrincipal.getViewport().setMaxY(25000);
        graphPrincipal.getViewport().setMaxX(12);

        graphPrincipal.addSeries(lineSeries);
        graphPrincipal.addSeries(pointSeries);


        return view;
    }

}
