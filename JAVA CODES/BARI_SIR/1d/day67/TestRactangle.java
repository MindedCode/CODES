package day67;

public class TestRactangle {
    public static void main(String[] args) {
        System.out.println("Hii Ganesh!\n");

        // constructed a objects help of new keyword -> allocated mem in heap
        Ractangle r1 = new Ractangle();
        Ractangle r2 = new Ractangle();

        // r1.length = 4;
        r1.setLength(10.3);
        r1.breadth = 6;

        // r2.length = 6;   //No Access becoz length is private member in TestRact
        r2.setLength(-6);
        r2.breadth = 4;

        System.out.println("Area: " + r1.Area());
        System.out.println("Perimeter: " + r1.perimeter());
        System.out.println("Square or not: " + r1.isSqr());

        System.out.println();
        System.out.println("Area: " + r2.Area());
        System.out.println("Perimeter: " + r2.perimeter());
        System.out.println("Square or not: " + r2.isSqr());
    }

}

class Ractangle {

    // properties
    private double length;
    double breadth;

    //Getter and Setter methods
    public void setLength(double l){
        // l > 0 ? (length = l) : (length = 0);  // error becoz  ternary conditional boolean value provide krta hai  here statement hum i think provide kr rhe hai java me statement(expression) kuch accessble nhi hote hai

        length = (l >= 0) ? l : 0;

        // length = l;  //💚
        // if(l>=0) length = l;  //✅  means working code
        // else length = 0;   
    }

    public double getLength(){
        return length;
    }

    // behaviars
    public double Area() {
        return getLength() * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

    public boolean isSqr() {
        // ractangle or not
        // if(length == breadth){
        // return true;
        // }else return false;
        return length == breadth;
    }
}
