package CoreJava.Module4;

class A{

    public A(){
        System.out.println("Constructor called");
    }

    void show(){
        System.out.println("show method");
    }
}

public class AnonymousObject
{
    public static void main(String[] args) {

        new A(); // anonymous object -- object without a name -- You cant use it again
        new A().show();

    }
}
