package AdvanceJava.Module1;

@FunctionalInterface
interface Test2 {
    void show();
}

//class B3 implements Test2{
//    public void show() {
//        System.out.println("Show");
//    }
//}

public class FunctionalInterfaceTest {
    public static void main(String[] args) {

//        B3 b = new B3();
//        b.show();

        Test2 t = new Test2(){
            public void show(){
                System.out.println("Show");
            };
        };
        t.show();
    }
}
