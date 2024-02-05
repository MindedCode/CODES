package day32.bari.u1;

/**
 * FindProtocalOfWeb
 */
public class FindProtocalOfWeb {

     public static void main(String[] args) {
        String s = "https://www.abc.com";

        int i=s.indexOf(':');
        String protocal = s.substring(0, i);

        boolean b = s.contains(s);
        System.out.println(b);

     //    if(protocal.equalsIgnoreCase())

     //    boolean b = s.contains);
     //    System.out.println(b);
     }
}