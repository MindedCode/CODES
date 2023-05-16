Example of Math.ceil()
class Example{

    public static void main(String args[]){ 
        
        double example1 = 8.24;
        double example2 = 10.0;
        int example3 = 2;
        
        double ceilOfExample1 = Math.ceil(example1); // ceil of 8.24 is 9.0
        double ceilOfExample2 = Math.ceil(example2); // ceil of 10.0 is 10.0
        double ceilOfExample3 = Math.ceil(example3); // ceil of 2 is 2.0
        
        System.out.println(ceilOfExample1); // prints 9.0
        System.out.println(ceilOfExample2); // prints 10.0
        System.out.println(ceilOfExample3); // prints 2.0
    }
}


//Output of the Program:
9.0
10.0
2.0
    
    
    
/// 2nd program::
    
import java.io.*;

public class Main{

static void checkperfectsquare(int n)
{
	
	if (Math.ceil((double)Math.sqrt(n)) == Math.floor((double)Math.sqrt(n)))
	{
	    System.out.println(Math.ceil((double)Math.sqrt(n)));
	    System.out.println(Math.floor((double)Math.sqrt(n)));
	    
	    System.out.println(Math.sqrt(n));
	    System.out.println(Math.floor(n));
	    System.out.println((double)Math.sqrt(n));
		System.out.print("True");
	}
	else
	{
	    System.out.println(Math.ceil((double)Math.sqrt(n)));
	    System.out.println(Math.floor((double)Math.sqrt(n)));
	    
	    System.out.println("square value : " + Math.sqrt(n));
	    System.out.println("only ceil value : "+Math.ceil(n));         
	    System.out.println("only floor value : "+Math.floor(n));        // if 5.4 or 5.9 => 6.0
	    System.out.println("    example of the program : " + Math.ceil(5.9) +" "+ Math.ceil(5.3));      // // if 5.9 the out => 5.0
	    System.out.println("    example of the program : " + Math.floor(5.9) + " "+ Math.floor(5.3));   //// if 5.4 or 5.9 => 6.0
	    System.out.println("use double casting : "+(double)Math.sqrt(n));
	    
		System.out.print("False");
	}
}

public static void main(String[] args)
{
	int n = 40;
	
	checkperfectsquare(n);
}
}




// output
7.0
6.0
square value : 6.324555320336759
only ceil value : 40.0
only floor value : 40.0
    example of the program : 6.0 6.0
    example of the program : 5.0 5.0
use double casting : 6.324555320336759
False

