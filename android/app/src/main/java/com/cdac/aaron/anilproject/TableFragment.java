package com.cdac.aaron.anilproject;


import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;


public class TableFragment extends Fragment {

    public TableFragment() {}


    Double numberOfPeriod, startAmount, interestRate, periodicDeposit;
    String switchBegEnd;
    ArrayList<Column> columnData;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_table, container, false);

        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("data", Context.MODE_PRIVATE);
        numberOfPeriod=Double.parseDouble(sharedPreferences.getString("numberOfPeriod",""));
        startAmount=Double.parseDouble(sharedPreferences.getString("startAmount",""));
        interestRate=Double.parseDouble(sharedPreferences.getString("interestRate",""));
        periodicDeposit=Double.parseDouble(sharedPreferences.getString("periodicDeposit",""));
        switchBegEnd = sharedPreferences.getString("switchBegEnd","");

        LinearLayout layout = (LinearLayout) view.findViewById(R.id.linearLayout1);
        TableLayout table = new TableLayout(getContext());

        TableRow row;
        Drawable cellShape;
        TextView cell;

        row = new TableRow(getContext());
        cellShape = getResources().getDrawable(R.drawable.cell_shape);

        for(int j = 0; j <= 5; j++)
        {
            cell = new android.support.v7.widget.AppCompatTextView(getContext());
            cell.setBackground(cellShape);
            cell.setTextSize(getResources().getDimension(R.dimen.largetextsize));
            switch (j)
            {
                case 0:
                    cell.setText("");
                    break;
                case 1:
                    cell.setText("start principal");
                    break;
                case 2:
                    cell.setText("start balance");
                    break;
                case 3:
                    cell.setText("interest");
                    break;
                case 4:
                    cell.setText("end balance");
                    break;
                case 5:
                    cell.setText("end principal");
                    break;
            }
            cell.setPadding(6, 4, 6, 4);
            row.addView(cell);
        }
        table.addView(row);

        if(switchBegEnd=="end")
            columnData= Scheduler.scheduleEnd(numberOfPeriod,startAmount,interestRate,periodicDeposit);
        else
            columnData= Scheduler.scheduleBegaining(numberOfPeriod,startAmount,interestRate,periodicDeposit);

        for (int i = 0; i < numberOfPeriod; i++) {

            row = new TableRow(getContext());

            for (int j = 0; j <= 5; j++) {

                cell = new android.support.v7.widget.AppCompatTextView(getContext());
                cell.setBackground(cellShape);
                switch (j)
                {
                    case 0:
                        cell.setText(i+1+"");
                        break;
                    case 1:
                        cell.setText(String.format("$%.2f",columnData.get(i).getStartPrincipal())); //String.format(("%.2f", number)
                        break;
                    case 2:
                        cell.setText(String.format("$%.2f",columnData.get(i).getStartBalance()));
                        break;
                    case 3:
                        cell.setText(String.format("$%.2f",columnData.get(i).getInterest()));
                        break;
                    case 4:
                        cell.setText(String.format("$%.2f",columnData.get(i).getEndBalance()));
                        break;
                    case 5:
                        cell.setText(String.format("$%.2f",columnData.get(i).getEndPrincipal()));
                        break;
                }
                cell.setPadding(6, 4, 6, 4);
                row.addView(cell);

            }

            table.addView(row);
        }

        layout.addView(table);


        return view;
    }

}
