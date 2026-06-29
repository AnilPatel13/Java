package AdvanceJava.Module5;

import java.util.List;
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {

        List<String> names = List.of("John", "Jane", "Jack", "Jill");

        Optional<String> name = names.stream().filter(s->s.startsWith("O")).findFirst();

        System.out.println(name.orElse("No Name"));
    }
}
