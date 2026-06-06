package CoreJava.Module3;

public class StringClass1 {
    public static void main(String[] args) {

        String str = "Hello";

        String Name = new String("Hello");
        System.out.println(Name);
        System.out.println(Name.hashCode());
        System.out.println(str.hashCode());
        System.out.println(Name + " Hello");

        String str1 = "Anil";
        System.out.println(str1.hashCode());

        str1 = str1 + "Kumar";
        System.out.println(str1.hashCode());

        String s1 = "Anil";
        String s2 = "Anil";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));




    }
}
