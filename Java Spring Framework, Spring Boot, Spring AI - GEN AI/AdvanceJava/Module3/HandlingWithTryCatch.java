package AdvanceJava.Module3;

public class HandlingWithTryCatch {
    public static void main(String[] args) {

        int i =10;
        int j = 2;

        try{
            int result = i/j;
            System.out.println(result);
        }
        catch(Exception e){
            System.out.println("Exception");
        }

        System.out.println("End");

    }
}
