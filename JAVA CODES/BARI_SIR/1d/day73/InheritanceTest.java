package day73;

public class InheritanceTest {
    public static void main(String[] args) {
        // int max = 5>6 ? 5 : 6;
        // System.out.println(max);

        //constructed the Circle obj c1.
        Circle  c1 = new Circle(); 
        new Circle(4);  //it's mean that    second line is executed   output is printed => t = 4;
        // System.out.println(c1.test);  // no visible

        // c1.redius = 9;    //no visible, redius is private member of Circle class.
        c1.redius = 5;    // now the set the protected access modifier in parent class.
        System.out.println("Area of Circle: "+c1.area());
        System.out.println("Perimeter of the Circle: "+c1.perimeter());
        System.out.println("Circumference of the Circle: "+c1.circumference());
        System.out.println();

        Cylinder c2 = new Cylinder(4);
        

        System.out.println("This is test line 2: "+c2.setTestvalue(12));
        // System.out.println("This is test line 3: "+c2.setTestvalue(new Circle(15)));

        System.out.println("Area of Cylinder: "+c2.area());
        System.out.println("Perimeter of the Cylinder: "+c2.perimeter());
        System.out.println("Volume of the Cylinder: "+c2.volume());
        System.out.println("Circumference of the Cylinder: "+c2.circumference());
        System.out.println();
    }
}
class Circle{
    protected double redius;
    private double test;
    // public  double r;
    public Circle(){
        redius = 0;
    }
    public Circle(double t){
        test = t;
        System.out.println("Test is line: "+t+" "+test);
    }
    public double area(){
        return Math.PI*redius*redius;
    }
    public double perimeter(){    //parimap(perimeter) and circumference(paridhi) both same
        return 2*Math.PI*redius;
    }
    public double circumference(){
        return perimeter();
    } //

    //Details of Product
    // public String toString(){
    //     // return Circle();   error: no return
    //     // return area() + perimeter() + circumference();   //error:   possible lossy conversion, method not calling in toString method becoz return this value double to string 
    // }
}
class Cylinder extends Circle{
    private double height;

    public double setTestvalue(int r){
        redius = r;
        return redius;
    }
    public Cylinder(int h){
        height = h;
    }
    public double area(){     //A=2πrh+2πr2     
        return 2*Math.PI*redius*(redius+height);   //redius is not visible in Inheriting class mean papa ki things access krane ke liye papa ki chije protected access modifier user hoga.
    }
    public double perimeter(){    //2(2r + h) or 4r + 2h.
        return 2*(2*redius+height);
    }
    public double volume(){      //area()*h
        return Math.PI*redius*redius*height;   //πr2h
    }
    public double circumference(){
        return perimeter();
    }

}
