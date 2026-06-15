package AdvanceJava.Module4;

class A1 extends Thread{

    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("A1 : " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

class B1 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("B1 : " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadPriorityAndSleep {
    public static void main(String[] args) {

        A1 a1 = new A1();
        B1 b1 = new B1();

        System.out.println("Priority of A1 : " + a1.getPriority());
        System.out.println("Priority of B1 : " + b1.getPriority());
        b1.setPriority(Thread.MAX_PRIORITY);
        a1.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Priority of A1 : " + a1.getPriority());
        System.out.println("Priority of B1 : " + b1.getPriority());
        a1.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        b1.start();


    }
}
