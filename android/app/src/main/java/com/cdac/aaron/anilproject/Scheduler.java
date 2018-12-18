package com.cdac.aaron.anilproject;

import android.util.Log;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by aaron on 6/19/2017.
 */

public class Scheduler implements Serializable {

    public static ArrayList<Column> scheduleEnd(double nPer, double amount, double rate, double periodicDeposit)
    {
        ArrayList<Column> table=new ArrayList<>();

        double principal=amount;
        double balance=amount;

        double interest=principal/100*rate;
        double newInterest=0;
        double endBalance=(balance/100*rate)+(balance+periodicDeposit);
        double endPrincipal=balance+periodicDeposit;

        for(int i=1;i<=nPer;i++)
        {
            table.add(new Column(principal, balance, interest, endBalance, endPrincipal));
            principal=endPrincipal;

            newInterest+=interest;

            balance=principal+newInterest;

            interest=balance/100*rate;
            endBalance=(interest)+(balance+periodicDeposit);
            endPrincipal=principal+periodicDeposit;

        }

        int count=1;
        for(Column a:table)
        {
            Log.d("count:",count+"");
            Log.d("data",a.toString());
            count++;
        }

        return table;

    }

    public static ArrayList<Column> scheduleBegaining(double nPer, double amount, double rate, double periodicDeposit)
    {

        ArrayList<Column> table=new ArrayList<>();

        double principal=amount+periodicDeposit;
        double balance=principal;

        double interest=principal/100*rate;
        double newInterest=0;
        double endBalance=principal+interest;
        double endPrincipal=principal;

        for(int i=1;i<=nPer;i++)
        {
            table.add(new Column(principal, balance, interest, endBalance, endPrincipal));
            principal=endPrincipal+periodicDeposit;

            newInterest+=interest;

            balance=principal+newInterest;

            interest=balance/100*rate;
            endBalance=balance+interest;
            endPrincipal=principal;

        }

        return table;
    }

}
