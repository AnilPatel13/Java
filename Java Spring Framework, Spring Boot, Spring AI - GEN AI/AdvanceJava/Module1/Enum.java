package AdvanceJava.Module1;

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Enum {


    public static void main(String[] args) {
        Day d = Day.MONDAY;
        System.out.println(d);
        System.out.println(d.name());
        System.out.println(d.ordinal());
        System.out.println(d.values()[0]);

        for(Day d1: d.values())
            System.out.println(d1);

    }
}
