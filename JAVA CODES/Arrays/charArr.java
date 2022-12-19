// user input character array in java

import java.util.*;

public class Main{
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of char array: ");
        int size = sc.nextInt();
        char arr[] = new char[size];
        
        System.out.println("Enter character: ");
        for(int i=0; i<size; i++)
            arr[i] = sc.next().charAt(0);
        for(int i=0; i<size; i++)
            System.out.print(arr[i] + " ");
    }
}

"Output of the program"
  Enter size of char array: 
6
Enter character: 
12
Enter size of char array: 
5
Enter character: 
244
423
23
245

646
Output of the char array :
2 4 2 2 6 
