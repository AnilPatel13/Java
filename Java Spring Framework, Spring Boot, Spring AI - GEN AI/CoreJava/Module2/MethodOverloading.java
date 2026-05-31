package CoreJava.Module2;

class Calculator1
{
    public int add(int a, int b, int c)
    {
        return a + b + c;
    }

    public int add(int a, int b)
    {
        return a + b;
    }

    public double add(double a, int b)
    {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {

        Calculator1 calc = new Calculator1();

        int result = calc.add(10, 20);
        System.out.println(result);

    }
}
