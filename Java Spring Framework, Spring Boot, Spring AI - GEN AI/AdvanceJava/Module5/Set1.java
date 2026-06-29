package AdvanceJava.Module5;

import java.util.*;

public class Set1 {
    public static void main(String[] args) {

//        Set<Integer> nums = new HashSet<Integer>();
//        nums.add(5);
//        nums.add(6);
//        nums.add(7);
//        nums.add(8);
//        nums.add(8);
//
//        System.out.println(nums);

        //sorted values

        Set<Integer> nums = new TreeSet<Integer>();
        nums.add(51);
        nums.add(29);
        nums.add(7);
        nums.add(8);
        nums.add(8);

        Iterator<Integer> it = nums.iterator();

        while(it.hasNext())
            System.out.println(it.next());

        System.out.println(nums);





    }
}
