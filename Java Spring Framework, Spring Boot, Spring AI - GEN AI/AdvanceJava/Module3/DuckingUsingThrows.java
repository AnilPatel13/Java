package AdvanceJava.Module3;

class X{
 public void m1() throws ClassNotFoundException{
     Class.forName("AdvanceJava.Module3.Demo");
 }
}

public class DuckingUsingThrows {

    static {
        System.out.println("class loaded");
    }

    public static void main(String[] args) {

        X x = new X();
        try {
            x.m1();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
            System.out.println("Exception: " + e);
        }

    }
}
