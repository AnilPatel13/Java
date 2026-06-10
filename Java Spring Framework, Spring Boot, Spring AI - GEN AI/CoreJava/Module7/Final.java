package CoreJava.Module7;

final class Calc {
    public void show()
    {
        System.out.println("Calc");
    }

    public final void add()
    {
        System.out.println("Add");
    }
}
//
//class Ad extends Calc {
//
//}

public class Final {
    public static void main(String[] args) {

        final int num = 8;
//        num = 10;
//
        System.out.println(num);

        Calc calc = new Calc();
        calc.show();
        calc.add();
    }
}
