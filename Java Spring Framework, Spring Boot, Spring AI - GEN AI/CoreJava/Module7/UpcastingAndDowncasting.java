package CoreJava.Module7;

class A1{
    public void show1(){
        System.out.println("A");
    }
}
class B1 extends A1{
    public void show2(){
        System.out.println("B");
    }
}


public class UpcastingAndDowncasting {
    public static void main(String[] args) {

        double d = 10.5;
        int i = (int) d;
        System.out.println(i);

        A1 a = (A1) new B1(); // Upcasting
        a.show1(); // Upcasting

        // Downcasting
        B1 b = (B1) a;
        b.show2();

    }
}
