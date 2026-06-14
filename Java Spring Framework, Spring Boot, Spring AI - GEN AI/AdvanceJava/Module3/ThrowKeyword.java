package AdvanceJava.Module3;

public class ThrowKeyword {
    public static void main(String[] args) {
        int i =20;
        int j = 0;

        try{
            j = 18/i;
            if(j==0){
                throw new ArithmeticException("Cannot divide by zero");
            }
        }
        catch(ArithmeticException e){
            j = 18/1;
            System.out.println("thats default value : " + e + " " + j);
        }
        catch(Exception e){
            System.out.println("Exception");
        }

        System.out.println(j);
        System.out.println("End");


    }
}
