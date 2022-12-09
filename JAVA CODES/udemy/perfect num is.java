import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        
        
        int t = 0; 
        while(t<=10){
            
        System.out.println("perfect number are ---6, 28, 496, 8128 \n");
        //Perfect Number, {2^(p -1)*(2^p)-1}    Mersenne Prime = 2^(p -1) prime = p;
       
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       
       
       if(n==1||n==0){
           System.out.println("-1\n");
       }
       int sum = 0;
       int i = 1; 
       while(i<=n){
           
           if(n%i==0){
               sum +=i;
           }
           i++;
       }
       
       if(sum == 2*n){
           System.out.println("The number is perfect \n");
       }
       else {
           System.out.println("The number is not perfect \n");
       }
       t++;
        }
    }
}



**/The output of the program is ::/**


perfect number are ---6, 28, 496, 8128 

0
-1

The number is perfect 

perfect number are ---6, 28, 496, 8128 

1
-1

The number is not perfect 

perfect number are ---6, 28, 496, 8128 

3
The number is not perfect 

perfect number are ---6, 28, 496, 8128 

3
The number is not perfect 

perfect number are ---6, 28, 496, 8128 

5
The number is not perfect 

perfect number are ---6, 28, 496, 8128 

10
The number is not perfect 

perfect number are ---6, 28, 496, 8128 

6
The number is perfect 

perfect number are ---6, 28, 496, 8128 

28
The number is perfect 

perfect number are ---6, 28, 496, 8128 

496
The number is perfect 

perfect number are ---6, 28, 496, 8128 

8128
The number is perfect 

perfect number are ---6, 28, 496, 8128 

16
The number is not perfect 
