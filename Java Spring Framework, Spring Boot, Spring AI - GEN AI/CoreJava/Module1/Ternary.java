package CoreJava.Module1;

public class Ternary {
    public static void main(String[] args) {
        int n = 4;
        int result = 0;

        if (n%2 == 0)
            result = 1;
        else
            result = 0;

        System.out.println(result);

        int result1 = n%2 == 0 ? 1 : 0;
        System.out.println(result1);

        int result2 = n%2 == 0 ? (n==4 ? 1 : 0) : 0;
        System.out.println(result2);

    }
}
