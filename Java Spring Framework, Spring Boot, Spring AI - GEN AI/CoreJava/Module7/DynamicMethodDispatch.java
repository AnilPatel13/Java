package CoreJava.Module7;

class A{
    public  void show(){
        System.out.println("A");
    }
}
class B extends A{
    public  void show(){
        System.out.println("B");
    }
}

class C extends A{
    public  void show(){
        System.out.println("C");
    }
}

public class DynamicMethodDispatch {

    public static void main(String[] args) {
//       B b = new B();
//       b.show();

        A a = new A();
        a.show();

        a = new B();
        a.show();

        a = new C();
        a.show();

    }
}
