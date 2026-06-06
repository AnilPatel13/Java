package CoreJava.Module3;

public class StringBufferAndStringBuilder {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        StringBuffer sb1 = new StringBuffer("hello");
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
        sb1.append("world");
        System.out.println(sb1);
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
        sb1.deleteCharAt(2);
        sb1.insert(0, "Java");
        sb1.setLength(30);
        String str = sb1.toString();
        System.out.println(str);


    }
}
