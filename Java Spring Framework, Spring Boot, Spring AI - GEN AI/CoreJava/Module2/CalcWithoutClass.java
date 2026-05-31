package CoreJava.Module2;


class Calculator
{
    public int add(int a, int b)
    {
        int result = a + b;
        System.out.println(result);
        return result;
    }
}

public class CalcWithoutClass {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
//        int result = a + b;
//        System.out.println(result);

        Calculator calc = new Calculator();
        int result = calc.add(a, b);
        System.out.println(result);

    }
}
