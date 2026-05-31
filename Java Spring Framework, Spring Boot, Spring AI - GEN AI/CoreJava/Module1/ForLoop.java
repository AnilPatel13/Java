package CoreJava.Module1;

public class ForLoop {
    public static void main(String[] args) {

//        for (int i = 0; i < 5; i++)
//        {
//            System.out.println("Hello" + i);
//        }
//        for (int i = 5; i > 1; i--)
//        {
//            System.out.println("Hello" + i);
//        }

        for (int i = 1; i <=5; i++)
        {
            System.out.println("Day " + i);
            for (int j = 9; j <=18; j++)
            {
                System.out.println("Hour " + j);
            }
        }

        int i =1;
        for (;i<5;)
        {
            System.out.println("Hello" + i);
            i++;
        }

    }
}
