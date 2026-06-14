package AdvanceJava.Module2;

@FunctionalInterface
interface A1 {
    int add(int a, int b);
}

public class LambdaExpressionReturn {
    public static void main(String[] args) {

//        A1 a = new A1(){
//            public int add(int a, int b) {
//                return a + b;
//            }
//        };
//        System.out.println(a.add(5, 10));

        A1 a = ( x,  y) -> x + y;

        System.out.println(a.add(5, 10));

    }
}
