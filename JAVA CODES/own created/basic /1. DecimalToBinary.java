/******************************************************************************

                            Own create 
			    1. binary to decimal in java 
			    2. using recursion in c

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
	
	
	
=========================================================// using recursion in c ==========================
	
	#include <stdio.h>

	void decimalToBinary(int n) {
	    if (n > 1) {
		decimalToBinary(n / 2);
	    }
	    printf("%d", n % 2);
	}

	int main() {
	    int n = 10;
	    decimalToBinary(n);

	    return 0;
	}	



Output of the program:
1010 
  
  
  
