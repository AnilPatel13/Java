package CoreJava.Module7;

public class WrapperClasses {
    public static void main(String[] args) {

        int i = 10;
        Integer i1 = i; // auto-boxing
        int num = i1.intValue(); // auto-unboxing
        System.out.println(i1);
        System.out.println(num);

        String s = "10";
        int num1 = Integer.parseInt(s);
        System.out.println(num1);

    }
}
