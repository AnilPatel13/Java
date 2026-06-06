package CoreJava.Module3;

class Human2{
    private int age;
    private String name;

    public Human2() {
        System.out.println("Constructor called");
        this.age = 25;
        this.name = "Anil";
    }

    public Human2(int age, String name) {
        System.out.println("Constructor called");
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


public class Constructor {

    public static void main(String[] args) {
        Human2 h = new Human2();
        Human2 h1 = new Human2(28,"John");
        System.out.println(h.getAge());
        System.out.println(h.getName());

        System.out.println(h1.getAge());
        System.out.println(h1.getName());

    }
}
