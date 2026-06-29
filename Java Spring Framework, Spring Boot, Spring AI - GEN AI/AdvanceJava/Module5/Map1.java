package AdvanceJava.Module5;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {

        Map<String, Integer> students = new Hashtable<>();

        students.put("X", 100);
        students.put("y", 200);
        students.put("A", 100);
        students.put("B", 200);
        students.put("A", 300);

        System.out.println(students);

        System.out.println(students.get("A"));

        System.out.println(students.keySet());
        System.out.println(students.values());

        for(String name: students.keySet())
        {
            System.out.println(name + " " +students.get(name));
        }



    }
}
