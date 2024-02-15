package day55;

import java.util.Scanner;

public class VaildPerson {
    static boolean vaildPerson(int x) {
        if (x >= 18)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int max = 4 > 5 ? 4 : 5;
        System.out.println(max);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter : ");
        int n = sc.nextInt();
        boolean result = vaildPerson(n);
        System.out.println(result);

    }
}
