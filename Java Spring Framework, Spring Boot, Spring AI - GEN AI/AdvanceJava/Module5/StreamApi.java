package AdvanceJava.Module5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8);

//        Stream<Integer> s1 = nums.stream();

//        s1.forEach(n-> System.out.println(n));
//        s1.forEach(n-> System.out.println(n)); -- you cannout use multiple time

//        Stream<Integer> s2 =  s1.filter(n-> n%2==0);
//        Stream<Integer> s3 =  s2.map(n-> n*2);
//        int result = s3.reduce(0,(n1,n2)-> n1+n2);
//        System.out.println(result);
//        s4.forEach(n-> System.out.println(n));

        int result = nums.stream()
                .filter(n-> n%2==0)
                .map(n-> n*2)
                .reduce(0,(n1,n2)-> n1+n2);
        System.out.println(result);

    }
}
