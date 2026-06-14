package AdvanceJava.Module1;

class Outer {

    int x = 10;
    public void display() {
        System.out.println("Outer class");
    }
    class Inner {
        public void show() {
            System.out.println("Inner class");
        }
    }

    static class Inner1 {
        public void show() {
            System.out.println("Inner class");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {

        Outer o = new Outer();
        o.display();
        Outer.Inner i = o.new Inner();
        i.show();
        Outer.Inner1 i1 = new Outer.Inner1();
        i1.show();

    }
}
