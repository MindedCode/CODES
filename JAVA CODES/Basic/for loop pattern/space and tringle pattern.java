
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		
		for(int i=0; i<n; i++){
		    for(int j=0; j<n; j++){
		        if(i+j>=n-1){
		            System.out.print("* ");
		        }
		        else
		        System.out.print("  ");
		    }
		    System.out.println();
		}
		
	}
}

output of the program:


3
    * 
  * * 
* * * 
