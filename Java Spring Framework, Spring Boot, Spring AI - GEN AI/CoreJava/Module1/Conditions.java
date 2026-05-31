package CoreJava.Module1;

public class Conditions {
    public static void main(String[] args) {

        int x = 28;

        if (x <= 10)
            System.out.println("x is less than 10");

        if (true)
            System.out.println("true");

        if (x>10 && x<=20)
            System.out.println("x is between 10 and 20");
        else
            System.out.println("x is not between 10 and 20");

        int x1 = 5;
        int y1 = 10;

        if (x1>y1) {
            System.out.println("x1 is greater than y1");
            System.out.println("x1 is greater than y1");
        }
        else
            System.out.println("y1 is greater than x1");

    }
}
