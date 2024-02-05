package day32.bari.u1;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        // int a = -5;
        // if (a > -8) {
        //     return;
        // } else
        //     System.out.println("yes");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 output is : 0");
        String str = sc.nextLine();

        // if (str.equalsIgnoreCase("1"))
        //     System.out.println("0"+"kjahdkaj");

        // if (str.equalsIgnoreCase("2"))
        //     System.out.println("1");

        // if (str.equalsIgnoreCase("3"))
        //     System.out.println("2");

        sc.close();

        if(str.equalsIgnoreCase("JAva")) System.out.println("1");
        else if(str.equalsIgnoreCase("javr")) System.out.println("2");
        else if (str.equalsIgnoreCase(str)) System.out.println(3);
    }

}
