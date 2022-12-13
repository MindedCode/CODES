/******************************************************************************
indexOf in Java
*******************************************************************************/


public class Main
{
	public static void main(String[] args) {
	    
	    
	    // 0 indexing 
	    String s = new String("This is Minded Code");
	    String s1 = "Minded Code";
	    
	    int w = s.indexOf("is");
	    int x = s1.indexOf("Code");
	    int y = s.indexOf('M'); //8
	    
	    System.out.println("first:- " + w);
		System.out.println("second:- " + x);
		System.out.println("third:- " + y);
		
		
	}
}



Output of the Program:

first:- 2
second:- 7
third:- 8
