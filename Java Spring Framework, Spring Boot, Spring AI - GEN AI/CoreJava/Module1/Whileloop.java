package CoreJava.Module1;

public class Whileloop {
    public static void main(String[] args) {

//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");

        // repeat the above 10 times
        // Finite Loop
        int i = 1;
//        while (i<5)
//        {
//            System.out.println("Hello");
//            i++;
//        }

        // Infinite Loop
//        while (true)
//        {
//            System.out.println("Hello " + i);
//            i++;
//        }

        // Nested Loop


        while( i< 5)
        {
            System.out.println("Hi " + i);
            int k = 0;
            while (k<3)
            {
                System.out.println("Hello " + k);
                k++;
            }

            i++;
        }




    }
}
