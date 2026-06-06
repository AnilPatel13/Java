package CoreJava.Module3;

class Mobile{

    String brand;
    int price;
    static String name;

    public void display(){
        System.out.println(brand);
        System.out.println(price);
        System.out.println(name);
    }

}

public class StaticVariable {
    public static void main(String[] args) {

        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 1000;
        Mobile.name = "iPhone";

        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.price = 1700;
        Mobile.name = "Smart Phone";

        Mobile.name = "phone";

        m1.display();
        m2.display();

    }
}
