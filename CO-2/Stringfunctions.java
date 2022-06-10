import java.lang.String;
public class Stringfunctions{
    public static void main (String args[]){
    String s1 = "Hello";
    String s2 = "Java";
    System.out.println("String 1 :"+s1);
     System.out.println("String 2 :"+s2);
    System.out.println(s1.length());
    System.out.println(s1.substring(1,3));
    System.out.println(s1.toLowerCase());
    System.out.println(s1.toUpperCase());
    System.out.println(s1+s2);
    System.out.println(s1.indexOf('e'));
    System.out.println(s1.contains("lo"));
    }
}