package AdvanceJava.Module5;

import java.util.List;

public class MethodRefrence {
    public static void main(String[] args) {

        List<String> names = List.of("John", "Jane", "Jack", "Jill");

        List<String> result = names.stream().map(String::toUpperCase).toList();

//        System.out.println(result);
        result.forEach(System.out::println);
    }
}
