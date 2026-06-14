package AdvanceJava.Module3;

public class TryMultipleCatch {

    public static void main(String[] args) {
        int num[] = new int[5];
        try {


            int j = 10 / 2;
            System.out.println("Result : " + j);
            System.out.println(num[10]);
            System.out.println(j);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("stay in limit");
            System.out.println("Exception : " + e);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Exception : " + e);
        }
        catch(Exception e){
            System.out.println("Exception : " + e);
        }

        System.out.println("End");
    }
}
