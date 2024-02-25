package day69.TestConstructor;

public class TestDefaultConstr {
    public static void main(String[] args) {
        int max = 12 > 55 ? 12 : 55;
        System.out.println(max);

        // Constructed/created object
        Ract r1 = new Ract();    //default constructor automatically  called then no created any parameterized constructor.
        Ract r2 = new Ract(4);
        Ract r3 = new Ract(10, 20);
        // Ract r1 = new Ract(0, 0);
        // Ract r1 = new Ract(double, double)); //error : expressions
        System.out.println(r1.getArea());
        System.out.println(r2.getArea());
        System.out.println(r3.getArea());
        // Ract r1 = new Ract(11,12);

    }
}

class Ract {
    private double len;
    private double breadth;

    // //Created/Constructor called

    Ract() {
        len = 1;
        breadth = 2;
        System.out.println(("Non-Para, Defalult constructor replaced"));
    }

    // double getArea() {
    //     return len * breadth;
    // }

    Ract(double l, double b) {
        len = l;
        breadth = b;
        System.out.println("Parameterized constructor 2 arguments "+l);
    }

    Ract(double s) {
        len = breadth = s;
        System.out.println("Parameterized constructor single arguments "+s);
    }
    //getter pro
    double getArea() {
        return len * breadth;
    }

}
