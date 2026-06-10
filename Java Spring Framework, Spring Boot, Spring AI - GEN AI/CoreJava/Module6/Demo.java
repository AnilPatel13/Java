package CoreJava.Module6;
import CoreJava.AccessModifier.*;

public class Demo {

    private int marks = 10;

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.marks);

        B b = new B();
        System.out.println(b.marks);

        Demo d = new Demo();
        System.out.println(d.marks);
    }
}
