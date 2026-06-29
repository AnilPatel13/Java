package AdvanceJava.Module5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ParallelStream {
    public static void main(String[] args) {

        int size = 10000;

        List<Integer> nums = new ArrayList<>(size);

        Random r = new Random();

        for (int i = 0; i < size; i++) {
            nums.add(r.nextInt(100));
        }

//        System.out.println(nums);

//        long startTime = System.currentTimeMillis();
//        int sum = nums.stream().map(n->{
//            try {
//                Thread.sleep(1);
//            }
//            catch (Exception e)
//            {
//                e.printStackTrace();
//            }
//            return n*2;
//        }).reduce(0,(n1,n2)->n1+n2);
//        System.out.println(sum);
//
//        long endTime = System.currentTimeMillis();
//        System.out.println("Time taken by stream: " + (endTime - startTime));

        long startTime1 = System.currentTimeMillis();

        int sum1 = nums.stream().map(n->{
            try {
                Thread.sleep(1);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            return n*2;
        }).mapToInt(i->i).sum();
        System.out.println(sum1);

        long endTime1 = System.currentTimeMillis();
        System.out.println("Time taken by stream: " + (endTime1 - startTime1));


        long startTime2 = System.currentTimeMillis();

        int sum3 = nums.parallelStream().map(n->{
            try {
                Thread.sleep(1);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            return n*2;
        }).mapToInt(i->i).sum();

        System.out.println(sum3);

        long endTime2 = System.currentTimeMillis();
        System.out.println("Time taken by stream: " + (endTime2 - startTime2));
    }
}
