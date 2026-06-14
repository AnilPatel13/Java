package AdvanceJava.Module1;

class A {
    public void show() {
        System.out.println("A");
    }
}
class B extends A {
    public void show() {
        System.out.println("B");
    }
}

public class AnonymousInnerClass {

    public static void main(String[] args) {

//        A obj = new A();
//        obj.show();
//        A obj = new B();
//        obj.show();

        A obj = new A()
        {
            public void show() {
                System.out.println("Anonymous Inner Class");
            }
        };
        obj.show();
    }
}
