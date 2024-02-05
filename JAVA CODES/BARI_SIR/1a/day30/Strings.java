package day32.bari.day30;

import javax.sound.midi.Soundbank;

class Strings {
    public static void main(String[] args) {
        String s4 = "    Jai Shree Ganesh          ";

        // // System.out.println(s);

        // // s.toLowerCase();
        // // System.out.println(s);

        // s = s.toLowerCase();

        // // System.out.println(s);

        // // s.trim();
        // // System.out.println(s);

        // // s = s.trim();
        // // System.out.print(s);
        // // System.out.print("Hii");

        // int i = s.indexOf("g");
        // System.out.println(i); // ans = -1
        // System.out.println("hi");

        // String s = "Mr. Adarsh Kumar";
        // String s1 = "Mr. Adarsh Kumar";
        // String s2 = "Mr. Adarsh Kumar";
        // // System.err.println(s.startsWith("Mr."));
        // // System.err.println(s.startsWith("Adarsh", 4));
        // // System.out.println(s.endsWith("Kumar"));
        // // System.out.println(s4.equals(s));
        // String s5 = "j";
        // String s6 = "J";
        // System.out.println(s5.compareTo(s6));

        // System.err.println(s.equalsIgnoreCase(s2));

        String str = "String";
        String str1 = "String";
        String str2 = new String("String");
        

        System.out.println(str.equals(str1));
        System.out.println(str.equals(str2));

        if(str == str1){
            System.out.println("Yes");
        }else System.out.println("No");
        if(str == str2) System.out.println(1);
        else System.out.print(0);
        System.out.println(str1.concat(str2));
        System.out.println(str+" "+str2+" "+str1);
        int a = 10;
        String s = String.valueOf(a);
        System.err.println(s+5);



    }
}