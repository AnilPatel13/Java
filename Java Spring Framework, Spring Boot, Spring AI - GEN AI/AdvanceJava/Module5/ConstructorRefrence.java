package AdvanceJava.Module5;

import java.util.ArrayList;
import java.util.List;

class Student1{
    private  String name;
    private int age;

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student1() {
    }

    public Student1(String name) {
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

    @Override
    public String toString() {
        return "Student1 [name=" + name + ", age=" + age + "]";
    }
}

public class ConstructorRefrence {
    public static void main(String[] args) {

        List<String> names = List.of("John", "Jane", "Jack", "Jill");

        List<Student1> students = new ArrayList<>();

//        for(String name : names){
//            students.add(new Student1(name, 20));
//        }
//        System.out.println(students);

//        students = names.stream().map(name-> new Student1(name, 20)).toList();
        students = names.stream().map(Student1::new).toList();
        System.out.println(students);


    }
}
