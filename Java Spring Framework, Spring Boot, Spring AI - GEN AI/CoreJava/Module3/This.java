package CoreJava.Module3;


class Human1 {
    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age, Human1 h) {
        h.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



public class This {

    public static void main(String[] args) {

        Human1 h = new Human1();
        h.setAge(25, h);
        h.setName("Anil");
        System.out.println(h.getAge());
        System.out.println(h.getName());

    }
}
