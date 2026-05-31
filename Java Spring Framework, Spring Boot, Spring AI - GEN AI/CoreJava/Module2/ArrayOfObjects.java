package CoreJava.Module2;

class Student{
    int rollNo;
    String name;
    int age;
}

public class ArrayOfObjects {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "John";
        s1.age = 20;

        Student s2 = new Student();
        s2.rollNo = 2;
        s2.name = "Anil";
        s2.age = 50;

        Student s3 = new Student();
        s3.rollNo = 4;
        s3.name = "Mike";
        s3.age = 10;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0; i<students.length; i++)
        {
            System.out.println(students[i].rollNo + " " + students[i].name + " " + students[i].age);
        }



//        int num[] = new int[5];
//        num[0] = 1;
//        num[1] = 2;
//        num[2] = 3;
//        num[3] = 4;
//        num[4] = 5;
//
//        for(int i=0; i<num.length; i++)
//        {
//            System.out.println(num[i]);
//        }



    }
}
