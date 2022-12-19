// Add two arr using temporary array 
// user input intacter array in java

import java.util.*;

public class Main{
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of int array: ");
        int size = sc.nextInt();
        int arr1[] = new int[size];
        int arr2[] = new int[size];
        int arr3[] = new int[size];
        
        
        System.out.println("Enter integer: ");
        for(int i=0; i<size; i++)
            arr1[i] = sc.nextInt();
            
        for(int i=0; i<size; i++)
            arr2[i] =sc.nextInt();
            
        for(int i=0; i<size; i++)
            arr3[i] = arr1[i] + arr2[i];
            
            
        System.out.println("Output of the int array1 :");
        for(int i=0; i<size; i++)
            System.out.print(arr1[i] + " ");
            
        System.out.println("Output of the int array2 :");
        for(int i=0; i<size; i++)
            System.out.print(arr2[i] + " ");
            
        System.out.println("Output of the int array :");
        for(int i=0; i<size; i++)
            System.out.print(arr3[i] + " ");
    }
}


Output of the Program:

Enter size of int array: 
4
Enter integer: 
1 2 34 5
1 2 3 4  
Output of the int array1 :
1 2 34 5 Output of the int array2 :
1 2 3 4 Output of the int array :
2 4 37 9 
  
  
