package CoreJava.Module4;

class A3{
    public void show(){
        System.out.println("show method A3");
    }

    public void config(){
        System.out.println("config method A3");
    }
}

class A4 extends A3{
    public void show(){
        System.out.println("show method A4");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        A4 a4 = new A4();
        a4.show();
        a4.config();
    }
}
