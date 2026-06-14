package AdvanceJava.Module1;

abstract class A1 {
    public abstract void show();
}

public class AbstractAnonymousInnerClass {
    public static void main(String args[]){

        A1 obj1 = new A1()
        {
            public void show() {
                System.out.println("B1");
            }
        };
        obj1.show();
    }

}
