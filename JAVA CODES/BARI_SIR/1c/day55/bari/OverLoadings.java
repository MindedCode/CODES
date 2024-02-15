package day55;

public class OverLoadings {
    
    static float clculateArea(int r){
        float area = 3.15f*r*r;
        return area;
    }

    static float clculateArea(float r){
        float area = (int)3.15f*r*r;
        return area;
    }
    public static void main(String[] args) {
        int radius = 4;
        float result = clculateArea(radius);
        System.out.println("Area of Circle: "+ result);
    }
}
