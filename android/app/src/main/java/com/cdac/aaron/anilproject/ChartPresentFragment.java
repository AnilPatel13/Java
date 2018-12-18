package com.cdac.aaron.anilproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;


public class ChartPresentFragment extends Fragment {


    PieChart pieChart;

    public ChartPresentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_chart, container, false);

        pieChart = (PieChart)view.findViewById(R.id.pieChart);

        ArrayList<Entry> yValues = new ArrayList<>();
        yValues.add(new Entry(20000, 0));
        yValues.add(new Entry(6362, 1));

        PieDataSet dataSet = new PieDataSet(yValues, "");
        dataSet.setColors(ColorTemplate.LIBERTY_COLORS);

        ArrayList<String> xValues = new ArrayList<>();

        xValues.add("Principal");
        xValues.add("Interest");

        PieData data = new PieData(xValues, dataSet);

        //data.setValueFormatter(new PercentFormatter());
        pieChart.setData(data);
        pieChart.setDescription("BreakDown");
        pieChart.setDrawHoleEnabled(false);


        return view;
    }

}
