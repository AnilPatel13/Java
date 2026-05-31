package CoreJava.Module2;

class student1{
    int rollNo;
    String name;
    int age;
}

public class EnhancedLoop  {
    public static void main(String[] args) {

        int num[] = {1,2,3,4,5};
        for(int n: num)
        {
            System.out.println(n);
        }

        int nums[] = new int[4];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;

        for(int n: nums)
        {
            System.out.println(n);
        }

        student1 s1 = new student1();
        s1.rollNo = 1;
        s1.name = "John";
        s1.age = 20;

        student1 s2 = new student1();
        s2.rollNo = 1;
        s2.name = "John";
        s2.age = 20;

        student1 s3 = new student1();
        s3.rollNo = 1;
        s3.name = "John";
        s3.age = 20;

        student1 st[] = new student1[3];
        st[0] = s1;
        st[1] = s2;
        st[2] = s3;

        for(student1 stud: st)
        {
            System.out.println(stud.rollNo + " " + stud.name + " " + stud.age);
        }


    }
}
