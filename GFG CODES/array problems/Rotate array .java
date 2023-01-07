import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    int a[] = {1,2,3,4,5};
		System.out.println("Enter array: ");
		
		for(int i=0; i<a.length; i++){
		    System.out.print(a[i] + " ");
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input how many times  you  want to  rotate array to left : " );
		int key = sc.nextInt();
		
		for(int i=0; i<key; i++){
    		int first = a[0];
    		
    		for(int j=0; j<a.length-1; j++){
    		    a[j]=a[j+1];
    		}
    		
    		a[a.length-1] = first;
	    }
		System.out.println();
		System.out.print("Output of the array : ");
		for(int i=0; i<a.length; i++){
		    System.out.print(a[i] + " ");
		}
	}
}


Enter array: 
1 2 3 4 5 
Input how many times  you  want to  rotate array to left : 
4

Output of the array : 5 1 2 3 4 
