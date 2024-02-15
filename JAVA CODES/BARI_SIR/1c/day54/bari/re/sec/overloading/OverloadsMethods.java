package day54.bari.re.sec.overloading;

public class OverloadsMethods {

    static int max(byte a, byte b) {
        return a > b ? a : b;
    }

    static int max(int a, int b) {
        return a > b ? a : b;
    }

    static int max(float a, float b) {
        return 0;
    }

    static int hello(int x){
        System.out.println("Hello World!");
        return x;

    }

    // static double hello(int x){
    //     System.out.println("Hello World!");
    //     return x;

    // }
    // static long hello(int x){
    //     System.out.println("Hello World!");
    //     return x;

    // }
    // static char hello(int x){
    //     System.out.println("Hello World!");
    //     return x;

    // }
    // static float hello(int x){
    //     System.out.println("Hello World!");
    //     return x;
    // }

    public static void main(String[] args) {
        System.out.println(max(14, 5));
        System.err.println(hello(45));
    }
}
