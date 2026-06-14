package AdvanceJava.Module1;

@Deprecated
class Test {
 public void show() {
    System.out.println("Show");
 }
}
class test2 extends Test {

    @Override
    public void show() {
    System.out.println("Show2");
 }
}

public class Annotation {
    public static void main(String[] args) {
        test2 t = new test2();
        t.show();
    }
}
