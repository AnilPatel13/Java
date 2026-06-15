package AdvanceJava.Module4;

class Counter{
    int count = 0;
    public synchronized void increment(){
        count++;
    }
}

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Runnable X1 = () -> {
            for(int i=0;i<10000;i++){
                counter.increment();
            }
        };
        Runnable X2 = () -> {
            for(int i=0;i<10000;i++){
                counter.increment();
            }
        };

        Thread t1 = new Thread(X1);
        Thread t2 = new Thread(X2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.count);

    }
}
