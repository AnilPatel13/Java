package AdvanceJava.Module2;

@FunctionalInterface
interface A {
    void show(int i);
}

public class LambdaExpression {
    public static void main(String[] args) {

//        A a = new A(){
//            public void show() {
//                System.out.println("Show");
//            }
//        };
//        a.show();

//        A a = () -> System.out.println("Show");
//        a.show();

//        A a = (i) -> System.out.println("Show :" + i);
//        a.show(5);

        A a = i -> System.out.println("Show :" + i);
        a.show(5);

    }
}
