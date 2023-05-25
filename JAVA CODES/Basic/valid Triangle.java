/******************************************************************************
                                    Valid Triangle
                method 1            
                    if and only if, the sum of any 2 sides of a Triangle is greater than the 3rd side.
                method 2
                    if If the sum of all three sides is 180 then it is a valid triangle.
                

*******************************************************************************/

public class Main
{
    static int  _vaild_Triangle(int x, int y, int z){
        if(x+y+z == 180)
            return x+y+z;
        else return x+y+z;
    }
    static void  vaild_Triangle(int x, int y, int z){
        if(x+y > z || y+z > x || z+x > y)
            System.out.println("if and only if, the sum of any 2 sides of a Triangle is greater than the 3rd side. \nvalid Triangle  \n");
        else System.out.println("Not");
    }
	public static void main(String[] args) {
	    
	    int a = 10, b = 30, c = 50; 
	    vaild_Triangle(a, b, c);
		
		
		a = 30; 
		b = 50; c = 100; 
	    
		System.out.println("If the sum of all three sides is 180 then \nit is a valid triangle " + _vaild_Triangle(a, b, c));
		
	}
}


if and only if, the sum of any 2 sides of a Triangle is greater than the 3rd side. 
valid Triangle  

If the sum of all three sides is 180 then 
it is a valid triangle 180
