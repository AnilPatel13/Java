package AdvanceJava.Module5;

import CoreJava.Module2.Array;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachImpl {
    public static void main(String[] args) {


        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

//        Consumer<Integer> con = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer n) {
//
//                System.out.println(n);
//
//            }
//        };
//
//        nums.forEach(con);

//
//        Consumer<Integer> con = n -> System.out.println(n);
//
//        nums.forEach(con);



        nums.forEach(n -> System.out.println(n));
    }
}
