/******************************************************************************

                Assignment - 11 C Language LIVE Community Classes MySirG

            1. Write a program to count digits in a given number
            2. Write a program to check whether a given number is a Prime number or not
            3. Write a program to calculate LCM of two numbers
            4. Write a program to reverse a given number

*******************************************************************************/

public class Main
{   
    static int countDigits(int n){
        int count =0;
        while(n>=1){
            n/=10;
            count++;
        }
        return count;
    }
    
    static String primeNumber(int n){
        int count = 0;
        for(int i=2; i<=9; i++){
            if(n%i == 0)
                count++;
        }
        String res = (count == 1) ? "Yes" : "No";
            return res;
    }
    
    static int LCM(int n1, int n2){
        while(n1 != n2){
            if(n1>n2)
            n1-=n2;
            else
            n2-=n1;
        }
        return n1;
        
    }
    
    static int reverse(int n){
        int reverse = 0;
        while(n>0){
            reverse = reverse * 10 + (n%10);
            n/=10;
        }
        return reverse;
    }
// 3333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333

    public static void main(String [] a){
        
	   // System.out.println(countDigits(234));
	   // System.out.println(primeNumber(7));
	   // System.out.println(LCM(24, 60));
	   System.out.println(reverse(345));
	}
}





