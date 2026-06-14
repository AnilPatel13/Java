package AdvanceJava.Module1;

// class -- class -> extends
// interface -- interface -> extends
// interface -- class -> implements
// abstract class -- class -> extends
// abstract class -- interface -> implements
// abstract class -- abstract class -> extends
// abstract class -- interface -> implements

interface A2 {
    int x = 10; // public static final
    int y = 20;
    void show();
    void display();
}

interface X {
    void running();
}

interface Y extends X {
    void running1();
}

class B2 implements A2, Y {
    public void show(){
        System.out.println("show");
    }
    public void display(){
        System.out.println("display");
    }

    public void running(){
        System.out.println("run");
    }
    public void running1(){
        System.out.println("run1");
    }
}

public class Interfaces {
    public static void main(String[] args) {

        B2 obj;
        obj = new B2();
        obj.show();
        obj.display();
        obj.running();
        obj.running1();
//        A2.x = 100; // we can change the value of x because it is public static final
        System.out.println(A2.x);
        System.out.println(A2.y);

    }
}
