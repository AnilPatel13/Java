package AdvanceJava.Module1;

interface Computer {
    void run();
}

class Laptop implements Computer {
    public void run() {
        System.out.println("Laptop");
    }
}

class Phone implements Computer {
    public void run() {
        System.out.println("Phone");
    }
}

class Dev {
    public void dev( Computer l) {
        System.out.println("Dev");
        l.run();
    }
}

public class NeedForInterface {
    public static void main(String[] args) {
        Computer c = new Laptop();
        Computer c1 = new Phone();
//        Laptop l = new Laptop();
//        Phone p = new Phone();
        Dev d = new Dev();
        d.dev(c);
    }
}
