package AdvanceJava.Module5;

import java.util.*;

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student st) {
        if(this.age > st.age)
        {
            return 1;
        }
        else {
            return -1;
        }
    }
}

public class ComparatorVsComparable {
    public static void main(String[] args) {
        Comparator<Integer> comp = new Comparator<Integer>()
        {
            public int compare(Integer i, Integer j) {

                if(i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
        };

        Comparator<Student> comp1 = (Student i, Student j) -> i.age > j.age?1:-1;

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);

        Collections.sort(nums, comp);

        System.out.println(nums);

        List<Student> nums1 = new ArrayList<Student>();
        nums1.add(new Student(21,"ABC"));
        nums1.add(new Student(242,"TTT"));
        nums1.add(new Student(25,"XXX"));
        nums1.add(new Student(28,"NNN"));

        Collections.sort(nums1);
        System.out.println(nums1);

        Collections.sort(nums1, comp1);
        System.out.println(nums1);

        for(Student s: nums1)
            System.out.println(s);



    }
}
