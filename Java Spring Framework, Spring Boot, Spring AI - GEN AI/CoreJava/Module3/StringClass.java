package CoreJava.Module3;

public class StringClass {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));
        System.out.println(str.substring(0, 2));
        System.out.println(str.substring(2));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.replace('H', 'h'));
        System.out.println(str.replace("Hello", "Hi"));
        System.out.println(str.indexOf('l'));
        System.out.println(str.indexOf("llo"));
        System.out.println(str.lastIndexOf('l'));
        System.out.println(str.lastIndexOf("llo"));
        System.out.println(str.trim());
        System.out.println(str.concat(" World"));
        System.out.println(str.contains("llo"));
        System.out.println(str.startsWith("Hello"));
        System.out.println(str.endsWith("Hello"));
    }
}
