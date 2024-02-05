package day36.bari.re;

public class Strings {
    public static void main(String[] args) {

        // String s = "Adarsh"; //-1

        // System.out.println(s);

        // String s1 = new String("Adarsh"); //-2
        // System.out.println(s1);

        // byte b [] = {65, 66, 67, 68};  //-3

        // String s2 = new String(b);
        // System.out.println(s2);

        // System.out.println(new String("Adarsh"));

        // char [] c = {'A','d','a','r','s','h'};  //-4
        // String s3 = new String(c);
        // System.out.println(s3);

        // System.out.println();
        // if (s3==s) 
        //     System.out.println("Simple");
        // if (s3==s1)  System.out.println("using new keyword create String");
        // if(s3==s2) 
        //     System.out.println("New using");
        // if(s3==s3) System.out.println("Same String");

        // System.out.println("this 1 par=====================");

        // if (s2==s) 
        //     System.out.println("Simple");
        // if (s2==s1)  System.out.println("using new keyword create String");
        // if(s2==s2) 
        //     System.out.println("New using");
        // if(s2==s3) System.out.println("Same String");

        //         System.out.println("this 2 par=====================");

        // if (s1==s) 
        //     System.out.println("Simple");
        // if (s1==s1)  System.out.println("using new keyword create String");
        // if(s1==s2) 
        //     System.out.println("New using");
        // if(s1==s3) System.out.println("Same String");

        // System.out.println("this 3 par=====================");

        // if (s==s) 
        //     System.out.println("Simple");
        // if (s==s1)  System.out.println("using new keyword create String");
        // if(s==s2) 
        //     System.out.println("New using");
        // if(s==s3) System.out.println("Same String");

        String s = "This Adarsh there";

        String s1 = new String("your welcome this platform") ;

        char c [] = {'T','h','i','s',' ','G','o','l','u'};
        String s2 = new String(c,0,9);   // respectively ==> offset(index), count(count letters display) count = c+1

        // s1 = new String(s1, 2,4);
        System.out.println(s2);

    }
}
