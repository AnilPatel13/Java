package CoreJava.Module2;

public class Array {
    public static void main(String[] args) {

        int num[] = {3, 4, 5, 6};
        System.out.println(num.length);
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);

        num[1] = 10;

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        int num1[] = new int[5];
        System.out.println(num1.length);
        System.out.println("-----" + num1[0]);
        num1[0] = 1;
        num1[1] = 2;
        num1[2] = 3;
        num1[3] = 4;
        num1[4] = 5;

        for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);
        }
    }
}
