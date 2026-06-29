package AdvanceJava.Module5;

import java.util.Arrays;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

//        int num = 0;
//
//        for(int n : nums)
//        {
//            if(n%2==0)
//            {
//                n = n*2;
//                num = num + n;
//            }
//        }
//
//        System.out.println(num);



//    for(int i = 0; i<nums.size();i++)
//    {
//        System.out.println(nums.get(i));
//    }

//        for(int n: nums)
//        {
//            System.out.println(n);
//        }


        //  Stream API

        nums.forEach(n -> System.out.println(n));


    }
}
