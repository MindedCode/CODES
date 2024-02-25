package d7071;


public class RactTest
{
	public static void main(String[] args) {
	    //created/constructed Object
	    // Ract r1 = new Ract();
	    // System.out.println("Check: "+r1.len + " "+ r1.breadth);
	    
	   // Sec Object
	   Ract r2 = new Ract(-1);
       System.out.println("Area: "+r2.area());
	   
	   
	   
	    
		System.out.println("Hello World");
	}
}

class Ract{
    double len, breadth;
    
    Ract(double l){
        len = l;
    }

    public double area(){
        return len*breadth;
    }
}
