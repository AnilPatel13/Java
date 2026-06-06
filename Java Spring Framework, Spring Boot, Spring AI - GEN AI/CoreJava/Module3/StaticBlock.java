package CoreJava.Module3;

class Mobile2{

    String brand;
    int price;
    static String name;

    static {
        System.out.println("Static block called");
    }

    public Mobile2() {
        brand = "iPhone";
        price = 1000;
    }

    public void display(){
        System.out.println(name);
        System.out.println(price);
        System.out.println(brand);
    }
}


public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {
//        Class.forName("CoreJava.Module3.Mobile2");

        Mobile2 m = new Mobile2();
        Mobile2.name = "Apple";
        m.display();

    }
}
