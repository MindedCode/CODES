package day60;

public class Recursion {
    static void fun(double n) { // it is most of use
        if (n > 0) {
            fun(n - 1);
            System.out.print(n + " ");
        } // o/p => 1 2 3 <----- directions
    }

    static void fun(int n) {
        if (n > 0) {
            System.out.println(n);
            fun(n - 1);
        } // o/p => 3 2 3 ----> direction.
    }

    public static void main(String[] args) {
        // int max = 6>5 ? 6 : 5;
        // System.out.println(max);
        System.out.println("Display output is opposite order : ");
        fun(4);
        System.out.println("Display output is Right order : ");
        fun(3.);
    }
}
