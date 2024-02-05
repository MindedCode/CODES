package day47.bari;

class RegularExpre{
    public static void main(String[] args) {
        System.out.println("\nHii Ganesh!");

        String s = "0";

        System.out.println(s.matches("[0]"));  //true
        String s1 = "a";
        System.out.println(s1.matches("."));   // true

        String s2 = "m";
        String s3 = "n";
        String s4 = "p";
        System.out.println(s2.matches("[mnp]")+" ");
        System.out.println(s3.matches("[mnp]")+" ");
        System.out.println(s4.matches("[mnp]")+" ");

        String s5 = "9";  //a-z and 0-9 only
        System.out.println(s5.matches("[a-z0-9]"));

        System.out.println(s5.matches("[a-z0-7]"));   // false

        String s6 = "M";
        System.out.println(s6.matches("[A-P9-9]"));
        
        String s7 = "H9";
        System.out.println(s7.matches("[A-P][9-9]"));

        String s8 = "R8";
        System.out.println(s8.matches("[^A-P][^9-9]"));



    }
}