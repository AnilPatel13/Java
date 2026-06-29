package AdvanceJava.Module5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class ArrayList1 {
    public static void main(String[] args) {

//        Collection<Integer> nums = new ArrayList<Integer>();
//        nums.add(5);
//        nums.add(6);
//        nums.add(7);
//        nums.add(8);
//
//        System.out.println(nums);
//
//        for(int n: nums)
//        {
//            System.out.println(n);
//        }

//        Collection nums = new ArrayList();
//        nums.add(5);
//        nums.add(6);
//        nums.add(7);
//        nums.add(8);
//
//        for(Object n: nums)
//            System.out.println((Integer) n);

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);

        nums.set(0,10);

        System.out.println(nums);

        System.out.println(nums.indexOf(7));

        System.out.println(nums.get(2));

//        for(Object n: nums)
//            System.out.println((Integer) n);




    }
}
