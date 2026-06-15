package AdvanceJava.Module4;

class Y1 {

}

//class X1 implements Runnable{
//    public void run(){
//        for(int i=1;i<=10;i++){
//            System.out.println("X1 : " + i);
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}

//class Z1 implements Runnable {
//    public void run() {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Z1 : " + i);
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}


public class RunnableVsTread {
    public static void main(String[] args) {

        Runnable x1 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("X1 : " + i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Runnable z1 = () -> {
        for (int i = 1; i <= 10; i++) {
            System.out.println("X1 : " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        };

        Thread t1 = new Thread(x1);
        Thread t2 = new Thread(z1);
        t1.start();
        t2.start();
    }
}
