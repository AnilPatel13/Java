package CoreJava.Module1;

public class ArithmeticOperators {
    public static void main(String[] args) {

        // Addition
        int num1 = 10;
        int num2 = 20;
        int result = num1 + num2;
        System.out.println(result);

        // Subtraction
        int result1 = num1 - num2;
        System.out.println(result1);

        // Div
        int result2 = num1 / num2;
        System.out.println(result2);

        // Mod
        int result3 = num1 % num2;
        System.out.println(result3);

        // increment
        num1 = num1 + 1;
        System.out.println(num1);

        // decrement
        num2 = num2 - 1;
        System.out.println(num2);

        num1 += 1;
        System.out.println(num1);

        num1 -= 1;
        System.out.println(num1);

        num1 *= 2;
        System.out.println(num1);

        num1++;
        System.out.println(num1);

        num2--;
        System.out.println(num2);

        // post increment
        num1++;
        System.out.println(num1);

        // pre increment
        ++num2;
        System.out.println(num2);

        int rest = num1++;
        System.out.println(rest);

        int rest1 = ++num2;
        System.out.println(rest1);
    }
}
