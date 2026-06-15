package AdvanceJava.Module4;

class A extends Thread
{
    public void run()
    {
        for(int i=1; i<=10;i++)
        {
            System.out.println("HI : " + i);
        }
    }
}

class B extends Thread
{
    public void run()
    {
        for(int i=1; i<=10;i++)
        {
            System.out.println("Hello : " + i);
        }
    }
}

public class MultiThread {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        a.start();
        b.start();

    }
}
