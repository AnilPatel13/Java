package CoreJava.Module1;

public class logicalOperator {
    public static void main(String[] args) {

        int x = 5;
        int y = 10;
        int z = 15;
        int w = 20;

        boolean result = x < y && x < z && x < w;
        System.out.println(result);

        boolean result1 = x < y || x < z || x < w;
        System.out.println(result1);

        boolean result2 = !(x < y);
        System.out.println(result2);

    }
}
