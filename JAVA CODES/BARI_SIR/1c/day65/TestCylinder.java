package day65;

/******************************************************************************

                      

*******************************************************************************/


public class TestCylinder
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Cylinder c1 = new Cylinder();
		
		c1.radius = 31;
		c1.height = 50;
		
		System.out.println(c1.lidArea());
		System.out.println(c1.totalSurfaceArea());
		System.out.printf("%.0f",c1.volume());
		
	}
}
class Cylinder{
    //Properties
    double radius;
    double height;
    
    //Behaviars
    double lidArea(){
        return Math.PI*radius*radius;
    }
    double totalSurfaceArea(){
        return 2*lidArea()+circumference()*height;
    }
    double volume(){
        return 2*Math.PI*radius;
    }
    double circumference(){
        return 2*Math.PI*radius;
    }
    
};


