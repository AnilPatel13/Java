package AdvanceJava.Module1;

enum Laptop1 {
    HP(500), DELL(300), MAC(800), MSI;

    private int price;

    Laptop1() {
        this.price = 0;
        System.out.println("Default Constructor : " + this.name());
    }

    Laptop1(int price) {
        this.price = price;
        System.out.println("Parameterized Constructor : " + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class EnumClass {
    public static void main(String[] args) {

        Laptop1 l = Laptop1.HP;
        System.out.println(l.getPrice());

        for(Laptop1 l1: l.values())
            System.out.println(l1 + " " + l1.getPrice());

    }
}
