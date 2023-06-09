/******************************************************************************

                            Own create binary to decimal

*******************************************************************************/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int n = 15;
	    int count = 4;
	    int arr[] = new int [count];
	    int rem = 0;
	    
	    while(n>=1){
	       // System.out.println(rem + " ");
	        rem = n%2;
	        count--;
	        arr[count] = rem;
	        
	       // arr = sc.next
	       // System.out.println(rem + " ");
	        n/=2;
	    }
		for(int i=0; i<arr.length; i++){
		    System.out.println(arr[i] + " ");
		}
	}
}



Output of the program:
1 1 1 1 
  
  
  
