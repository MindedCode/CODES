package day64;

public class RactangleTest {
    public static void main(String[] args) {
        System.out.println("Hii Ganesh!\n");

        //constructed a objects help of new keyword -> allocated mem in heap  
        Ractangle r1 = new Ractangle();
        Ractangle r2 = new Ractangle();

        r1.length = 4;
        r1.breadth = 6;

        r2.length = 6;
        r2.breadth = 4;

        System.out.println("Area: "+r1.area());
        System.out.println("Perimeter: "+r1.perimeter());
        System.out.println("Ractangle or not: "+r1.isSqr());

        System.out.println();
        System.out.println("Area: "+r2.area());
        System.out.println("Perimeter: "+r2.perimeter());
        System.out.println("Ractangle or not: "+r2.isSqr());
    }

}
class Ractangle{

    //properties
    double length;
    double breadth;

    //behaviars
    public double area(){
        return length * breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
    public boolean isSqr(){
        // ractangle or not
        // if(length == breadth){
        //     return true;
        // }else return false;
        return length == breadth;
    }
}

