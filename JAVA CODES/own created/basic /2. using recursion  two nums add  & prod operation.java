/******************************************************************************

                            
                            without using 3rd variable 
                            returnytype void product two number
                            add two number
                            
                            

*******************************************************************************/

public class Main
{
    
    public static int multiply(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a + multiply(a, b - 1);
        }
    }
    
    
    public static void prod(int a, int b, int result){
         int r = 0;
        if(b==0){
            System.out.println(result);
        }
        else{
           
            prod(a, b - 1, result + a);
            
        }
    }
    public static void add(int a, int b){
        if(b == 0){
	        System.out.println(a) ;
	    }
	    
	    else{
	        int r = 0;
	        add(a+1, b-1);
	       // System.out.println(r);
	    }
    }
	public static void main(String[] args) {
	    
	    int a, b;
	    a=5;
	    b=6;
	    add(a,b);
	    prod(a, b, 0);
	    int product = multiply(a, b);
        System.out.println("Product: " + product);
	}
}




output of the Program:

11
30
Product: 30
