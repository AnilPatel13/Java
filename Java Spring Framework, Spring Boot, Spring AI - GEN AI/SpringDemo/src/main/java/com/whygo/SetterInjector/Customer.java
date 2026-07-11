package com.whygo.SetterInjector;

public class Customer {

    private int age;
    private Computer com;

    public Customer() {
        System.out.println("Customer Constructor");
    }

    public Customer(int age) {
        System.out.println("Customer Constructor with age");
        this.age = age;
//        this.laptop = laptop;
    }

//    @ConstructorProperties({"age", "laptop"})
//    public Customer(int age, Laptop laptop) {
//        System.out.println("para 2 Customer Constructor with age");
//        this.age = age;
//        this.laptop = laptop;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setting age");
        this.age = age;
    }

//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }


    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void getCustomer() {
        System.out.println("Customer");
        com.getLaptop();
    }
}
