/******************************************************************************

                            Assignment 8 
            1. to check whether a given number is divisible by 3 and divisible by 2.
            2. Write a program to check whether a given year is a leap year or not.
            3. program to check whether a given character is an alphabet (uppercase), an alphabet (lower case), a digit or a special character.
            4. Write a program to find the nature of roots of a quadratic equation.

*******************************************************************************/

public class Main
{   public static void leapYr(int yr){
        if(yr%4==0 && yr%100==0)
            System.out.println("yes leapYr");
        else if(yr%400==0)
            System.out.println("Yes Leap");
        else System.out.println("No");
    }
    
    
// 3333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333
    public static char getCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return 'U'; // U for Uppercase Alphabet
        } else if (ch >= 'a' && ch <= 'z') {
            return 'L'; // L for Lowercase Alphabet
        } else if (ch >= '0' && ch <= '9') {
            return 'D'; // D for Digit
        } else {
            return 'S'; // S for Special Character
        }
    }
    public static void checkcharacter(char ch) {
        // char ch = 'A'; // Replace this with the character you want to check

        switch (getCharType(ch)) {
            case 'U':
                System.out.println(ch + " is an uppercase alphabet.");
                break;
            case 'L':
                System.out.println(ch + " is a lowercase alphabet.");
                break;
            case 'D':
                System.out.println(ch + " is a digit.");
                break;
            default:
                System.out.println(ch + " is a special character.");
                break;
        }
    }
// 3333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333
    
	public static void main(String[] args) {
	    
// 	    int n = 246;
	    
// 	    if(n%2==0 && n%3==0){
// 		System.out.println("yes");
// 	    }
// 	    else{
// 	        System.out.println("NO");
// 	    }
	   // int year = 2022;
	   // leapYr(year);
	    
	    char ch = ';';
	    checkcharacter(ch);
	}
}

// import java.util.Scanner;

// public class QuadraticRoots {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter the coefficients of the quadratic equation (ax^2 + bx + c):");
//         System.out.print("Enter the value of a: ");
//         double a = scanner.nextDouble();
//         System.out.print("Enter the value of b: ");
//         double b = scanner.nextDouble();
//         System.out.print("Enter the value of c: ");
//         double c = scanner.nextDouble();

//         double discriminant = b * b - 4 * a * c;

//         if (discriminant > 0) {
//             System.out.println("The quadratic equation has two distinct real roots.");
//         } else if (discriminant == 0) {
//             System.out.println("The quadratic equation has two real and identical roots.");
//         } else {
//             System.out.println("The quadratic equation has two complex (non-real) roots.");
//         }

//         scanner.close();
//     }
// }



