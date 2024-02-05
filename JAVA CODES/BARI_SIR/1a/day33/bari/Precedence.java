package Lecs.day33.bari;

/**
 * Precedence
 */
public class Precedence {

    public static void main(String[] args) {
        // int a = 500/25/5/2; // 20/5/4/1 => 4/2  left shift precedence
        // System.out.println(a);

        // int b = 2/5*3%4; // 2/15%4 => 0/4   
        // int c = 10/5*3%4; // 2*3%4 => 6%4 => 2    => 10/15%4 => 0
        // int d = 10/5*2%4; // 2*2%4 => 0  => 10/10%4 => 1
        // System.out.println(b+" "+c+ " "+d);

        // int a = 10-5/10*5; // => 10
        // System.out.println(a);

        // int a = 10*5/10-5; //=> 0
        // System.out.println(a);
        // byte a = 0b1000;
        // a>>>=1;
        // System.out.println(a);

        // String bString = Integer.toBinaryString(4|0b1100);
        // System.out.format("%35s\n", bString);
        // System.out.format("%4s\n", bString);


        // System.out.println(Integer.toBinaryString(a|1100));


        // System.out.println(Integer.toBinaryString(a&1100));

        // System.out.println(Integer.toBinaryString(a+0b1100));
        // int b = a+0b1100;
        // System.out.println(b);
        // b>>>=1;

        // System.out.println(b);
        // b>>=1;

        int v = 5;
        System.out.println(v>>>=1);
        System.out.println(Integer.toBinaryString(v));
        System.out.println(v>>=1);        
        System.out.println(Integer.toBinaryString(v));








    }
}