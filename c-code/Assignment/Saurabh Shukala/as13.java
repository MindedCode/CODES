/******************************************************************************

                                Assignment - 13 C Language LIVE Community Classes MySirG

                        1. Write a program which takes the month number as an input and display number of days in that month.
                        2. Write a menu driven program with the following options:
                            a. Addition b. Subtraction c. Multiplication d. Division e. Exit
                        3. Write a program which takes the day number of a week and displays a unique greeting message for the day.
                        4. Write a menu driven program with the following options:
                            a. Check whether a given set of three numbers are lengths of an isosceles triangle or not
                            b. Check whether a given set of three numbers are lengths of sides of a right angled triangle or not
                            c. Check whether a given set of three numbers are equilateral triangle or not
                            d. Exit

*******************************************************************************/
import java.util.*;
public class Main
{
    static void DayGreatings(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of day : ");
        int n = sc.nextInt();
        
        switch(n){
	        case 1 : System.out.println("Om Shree Ganesh Nama");break; 
	        case 2 : System.out.println("Jay Hanuman");break;
	        case 3 : System.out.println("Jay ho Dudheshvarnath ki");break;
	        case 4 : System.out.println("Om Guru Dev Nama");break;
	        case 5 : System.out.println("Om Shukra Devay nama");break;
	        case 6 : System.out.println("Om Shani Devay Nama");break;
	        case 7 : System.out.println("Hollyday");break;
	        default : System.out.println("Invalid number of Day");
        }
        
    }
	public static void main(String[] args) {
	   // Scanner sc = new Scanner(System.in);
	   // for(int i=0; i<13; i++){
	   // System.out.println("Enter the number of month: ");
	   // int number = sc.nextInt();
	    
	   // switch(number){
	   //     case 2 : System.out.println(28 +  " 29");break; 
	   //     case 1 :
	   //     case 3 : 
	   //     case 5 :
	   //     case 7 :
	   //     case 8 :
	   //     case 10 :
	   //     case 12 : System.out.println(31); break;
	   //     case 4: 
	   //     case 6:
	   //     case 9:
	   //     case 11: System.out.println(30); break;
	   //     default : System.out.println("Invalid Input : ");
	   // }
	   // }
	    
// Enter the number of month: 
// 0
// Invalid Input : 
// Enter the number of month: 
// 1
// 31
// Enter the number of month: 
// 2
// 28 29
// Enter the number of month: 
// 3
// 31
// Enter the number of month: 
// 4
// 30
// Enter the number of month: 
// 5
// 31
// Enter the number of month: 
// 6
// 30
// Enter the number of month: 
// 7
// 31
// Enter the number of month: 
// 8
// 31
// Enter the number of month: 
// 9
// 30
// Enter the number of month: 
// 10
// 31
// Enter the number of month: 
// 11
// 30
// Enter the number of month: 
// 12
// 31

System.out.println();
DayGreatings();
	}
}
