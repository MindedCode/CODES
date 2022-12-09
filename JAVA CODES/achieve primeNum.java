import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        
        
        int t = 0;
        while(t<= 10){
            
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
            
        if(n==1 || n == 0){
        System.out.println("-1");
        }
       
        int i=2;
        int count = 0;
        while(i<=n){
            if(n%i==0){
                count++;
            }
            i++;
        }
        if(count == 1){
            System.out.println("the Number is prime");
        }
        else
        System.out.println("the Number is not prime ");
            t++;
        }
    }
}


Output ofthe program ::;


0
-1
the Number is not prime 
1
-1
the Number is not prime 
3
the Number is prime
2
the Number is prime
4
the Number is not prime 
5
the Number is prime
6
the Number is not prime 
7
the Number is prime
8
the Number is not prime 
9
the Number is not prime 
3
the Number is prime
