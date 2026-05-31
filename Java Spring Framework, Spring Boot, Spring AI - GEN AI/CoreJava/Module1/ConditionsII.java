package CoreJava.Module1;

public class ConditionsII {
    public static void main(String[] args) {

        int x = 8;
        int y = 7;
        int z = 9;

        if (x >y && x>z)
            System.out.println(x);
        else if (y>z)
            System.out.println(y);
        else
            System.out.println(z);

    }
}
