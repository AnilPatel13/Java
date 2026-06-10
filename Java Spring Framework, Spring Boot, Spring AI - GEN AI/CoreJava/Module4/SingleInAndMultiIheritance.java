package CoreJava.Module4;

public class SingleInAndMultiIheritance {

    public static void main(String[] args) {

        // Single Inheritance
        AdvanceCalculator v = new AdvanceCalculator();
        System.out.println(v.add(10, 20));
        System.out.println(v.sub(10, 20));
        System.out.println(v.mul(10, 20));
        System.out.println(v.div(10, 20));

        // Multi Inheritance
        VeryAdvCanculator v1 = new VeryAdvCanculator();
        System.out.println(v1.add(10, 20));
        System.out.println(v1.sub(10, 20));
        System.out.println(v1.mul(10, 20));
        System.out.println(v1.div(10, 20));
        System.out.println(v1.power(10, 20));

    }
}
