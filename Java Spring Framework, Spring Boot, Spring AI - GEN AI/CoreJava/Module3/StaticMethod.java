package CoreJava.Module3;

class Mobile1 {
    String brand;
    int price;
    static String name;

    public void display(){
        System.out.println(brand);
        System.out.println(price);
        System.out.println(name);
    }

    public static void show1(Mobile1 obj1){
        System.out.println(name);
        System.out.println(obj1.brand);
        System.out.println(obj1.price);
    }

    public static void show(){
        System.out.println(name);
    }
}

public class StaticMethod {
    public static void main(String[] args) {

        Mobile1 m1 = new Mobile1();
        m1.brand = "Apple";
        m1.price = 1000;
        Mobile1.name = "iPhone";
        m1.display();
        Mobile1.show();
        Mobile1.show1(m1);

    }
}
