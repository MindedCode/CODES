/******************************************************************************

                            Palindromic Pattern
                            

*******************************************************************************/

public class Main
{
    
// ----1
// ---121
// --12321
// -1234321
// 123454321

	public static void main(String[] args) {
	    int n = 5;
	    for(int i=1; i<=n; i++){
	        for(int s=n-i; s>=1; s--){
	            System.out.print("-");
	        }
	        for(int j=1; j<=i; j++){
	            System.out.print(j);
	        }
	        for(int l = i-1; l >= 1; l--){
	            System.out.print(l);
	            
	        }
	        System.out.println("");
	    }System.out.println("");
	    
// A B C D E 
// A B C D 
// A B C 
// A B 
// A 

	    for(int i=n; i>=1; i--){
	        for (int j=1; j<=i; j++) {
                System.out.print((char) (64 + j) + " ");
            }System.out.println("");  
	    }
	    System.out.println("");
	    
// ABCDEDCBA
// -ABCDCBA
// --ABCBA
// ---ABA
// ----A

	    for(int i=n; i>=1; i--){
	        for(int s=n-i; s>=1; s--){
	            System.out.print("-");
	        }
	        for(int j=1; j<=i; j++){
	            System.out.print((char)(64+j));
	        }
	        for(int l = i-1; l >= 1; l--){
	            System.out.print((char) (64 + l));
	            
	        }
	        System.out.println("");
	    }System.out.println("");
	    
	    for(int i=n; i>=1; i--){
	        int t = 1;
	        for(int j=n+t; j<=t; j++){
	            System.out.print(j);
	            t++;
	        }
	        System.out.println();
	    }
	}
}




