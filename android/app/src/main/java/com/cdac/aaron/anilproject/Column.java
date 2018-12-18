package com.cdac.aaron.anilproject;

import java.io.Serializable;

/**
 * Created by aaron on 6/19/2017.
 */

public class Column implements Serializable {

    double startPrincipal;
    double startBalance;
    double interest;
    double endBalance;
    double endPrincipal;

    public Column(double startPrincipal, double startBalance, double interest, double endBalance, double endPrincipal) {
        this.startPrincipal = startPrincipal;
        this.startBalance = startBalance;
        this.interest = interest;
        this.endBalance = endBalance;
        this.endPrincipal = endPrincipal;
    }

    public double getStartPrincipal() {
        return startPrincipal;
    }

    public double getStartBalance() {
        return startBalance;
    }

    public double getInterest() {
        return interest;
    }

    public double getEndBalance() {
        return endBalance;
    }

    public double getEndPrincipal() {
        return endPrincipal;
    }

    @Override
    public String toString() {
        return "Column{" +
                "startPrincipal=" + startPrincipal +
                ", startBalance=" + startBalance +
                ", interest=" + interest +
                ", endBalance=" + endBalance +
                ", endPrincipal=" + endPrincipal +
                '}';
    }
}
