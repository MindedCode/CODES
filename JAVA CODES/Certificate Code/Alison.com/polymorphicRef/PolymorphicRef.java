package polymorphicRef;

public class PolymorphicRef {
    public static void main(String[] args) {

//        PolymorphicReference
//        is a parent class "Any Java object that can pass more
//        than one IS-A test is considered to be polymorphic."

        System.out.println("all class methods call this Parent class : ");

        PolymorphicRef p = new Bmw();
        p.color();
        Vehicles v = new Bmw();
        v.color();
        Car c = new Bmw();
        c.color();
        Bmw b = new Bmw();
        b.color();

        System.out.println("\nnow display store the element of Array ");

        Vehicles[] polyArr = new Vehicles[3];
        polyArr[0] = new Bmw();
        polyArr[1] = new Car();
        polyArr[2] = new Vehicles();

        for (int i = 0; i < polyArr.length; i++)
            polyArr[i].color();
        // use class name of use Datatype and reference
        System.out.println("\nuse class name of use Datatype and reference");
    PolymorphicRef t = new PolymorphicRef();

    Bmw b1 = new Bmw();
    Car c1 = new Car();
    Vehicles vehicles = new Vehicles();

    c.getColor(b1);
    t.getColor(c1);
    c1.getColor(vehicles);

    }
    public void getColor(Vehicles c1) {
        c1.color();
    }
    public void color() {
        System.out.println("All");
    }
}

// Output of the Program:
//all class methods call this Parent class :
//        Bmw is Blue
//        Bmw is Blue
//        Bmw is Blue
//        Bmw is Blue
//
//        now display store the element of Array
//        Bmw is Blue
//        Car colors
//        Vehicle colors
//
//        use class name of use Datatype and reference
//        Bmw is Blue
//        Car colors
//        Vehicle colors
//
//        Process finished with exit code 0
