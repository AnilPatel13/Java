package CoreJava.Module1;

public class TypeConversion {
    public static void main(String[] args) {

        int num = 10;
        double d = num;
        System.out.println(d);

        byte b = 127;
        System.out.println(b);

        int a = b;
        System.out.println(a);

        int z = 12;

        byte k = (byte) z;
        System.out.println(k);

        int z1 = 257;

        byte k1 = (byte) z1;
        System.out.println(k1);

        float f = 12.5f;
        int i = (int) f;
        System.out.println(i);

        // Type Promotion

        byte b1 = 10;
        byte b2 = 20;
        int result = b1 + b2;
        System.out.println(result);

    }
}
