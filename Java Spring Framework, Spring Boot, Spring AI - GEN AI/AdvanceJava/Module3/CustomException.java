package AdvanceJava.Module3;

class MyException extends Exception{

    public MyException(String message){
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        int i =20;
        int j = 0;

        try{
            j = 18/i;
            if(j==0){
                throw new MyException("Cannot divide by zero");
            }
        }
        catch(MyException e){
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