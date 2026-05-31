package CoreJava.Module2;


class Calculator2
{
    int num=5;
    public int add(int a, int b)
    {
        System.out.println(num);
        return a + b;
    }
}

public class StackAndHeap {
    public static void main(String[] args) {
        int a = 10;
        Calculator2 calc = new Calculator2();
        int result = calc.add(10, 20);
        System.out.println(result);

        Calculator2 calc1 = new Calculator2();

        calc.num =10;
        System.out.println(calc.num);
        System.out.println(calc1.num);
    }
}
