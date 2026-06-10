package CoreJava.Module4;

// Object class is the parent class of all classes in Java
// Every class in Java extends Object class by default
class  A1 extends Object {
    public A1(){
        super();
        System.out.println("A1 constructor");
    }

    public A1(int a){
        super();
        System.out.println("A1 constructor : " + a);
    }
}

class  A2 extends A1{
    public A2(){
        super(5);
        System.out.println("A2 constructor");
    }

    public A2(int a){
        this();
//        super(a); // calls the parent class constructor -- its default has
        System.out.println("A2 constructor : " + a);
    }
}


public class ThisAndSuper {

    public static void main(String[] args) {

//        A2 a2 = new A2(5);
//          A2 a2 = new A2();

        A2 a2 = new A2(5);
    }
}
