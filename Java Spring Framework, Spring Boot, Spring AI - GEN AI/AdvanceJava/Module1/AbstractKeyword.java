package AdvanceJava.Module1;

abstract class car {
    public abstract void drive() ;

    public void playMusic() {
        System.out.println("Playing music");
    }
}

class BMW extends car {
    public void drive() {
        System.out.println("BMW is driving");
    }
}

public class AbstractKeyword {
    public static void main(String[] args) {

        car c = new BMW();
        c.drive();
        c.playMusic();
    }
}
