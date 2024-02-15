package day63;


// Lets go to main mathod
public class LearnJavaClasses {
    public static void main(String[] args) {
        // create object1 in heap
        Circle c1 = new Circle(); // created/constructed many Object
        Circle c2 = new Circle();

        // set property value
        c1.radius = 10;
        c2.radius = 15;
        
        System.out.println("first Object/circle : behaviar:\n ");

        System.out.println("Area: " + c1.area());
        System.out.println("Perimeter: " + c1.perimeter());
        System.out.println("Circumference: " + c1.circumference());


        System.out.println("\nSecond Object/circle : behaviar:\n ");

        System.out.println("Area: " + c2.area());
        System.out.println("Perimeter: " + c2.perimeter());
        System.out.println("Circumference: " + c2.circumference());

        System.out.print("\nAddress of Objects c1 and C2: "+ c1+" "+c2);

        // System.out.println(c1+" "+c2);

    }
}  

class Circle {
    // properties
    public double radius;

    // behaviar/methods
    public double area() {
        return Math.PI * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double circumference() {
        return perimeter();
    }
}



