package AdvanceJava.Module5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamApi1 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

//        Predicate<Integer> p1 = n -> n%2==0;
//
//        nums.stream().filter(p1).forEach(n-> System.out.println(n));
//
//        Function<Integer, Integer> f1 = n -> n*2;
//
//        nums.stream().filter(p1).map(f1).forEach(n-> System.out.println(n));

        nums.stream().filter(n-> n%2==0).sorted().forEach(n-> System.out.println(n));

    }
}
