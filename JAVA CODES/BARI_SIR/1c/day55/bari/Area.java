package day55;


/**
 * Area
 */
public class Area {
    static double area(int r) {
        return 3.14 * r * r;
    }

    static double area(int l, int b) {
        return l * b * 0.5;
        // return (l*b)/2;
    }

    // static double area(int l, int w) {
    //     return l * w;
    //     // return (l*b)/2;
    // }

    // static double area(int r, int h) {
    //     return 3.14 * r * r * h;
    // }

    // static double area(int s) {
    //     return s * s;
    // }

    public static void main(String[] args) {
        int max = 5 > 6 ? 5 : 6;
        System.out.println(max);

        System.out.println("Area of Circle: ");
        int radius = 4;
        double result = area(radius);
        System.out.println(result);

        System.out.println("Area of triangle: ");
        int length = 3, breadth = 4;
        result= area(length, breadth);
        System.out.println(result);

        // System.out.println("Area of Rectangle: ");
        // int width = 4;
        // area(length, width);

        // // pi*r^2h
        // System.out.println("Area of Cilinder: ");
        // int height = 4;
        // area(length, height);

        // System.out.println("Area of Square: ");
        // int side = 4;
        // area(side);
    }
}