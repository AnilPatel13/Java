package com.whygo.springbootweb;

public class Customer {

    private int custid;
    private String custname;

    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    @Override
    public String toString() {
        return "Customer [custid=" + custid + ", custname=" + custname + "]";
    }
}
