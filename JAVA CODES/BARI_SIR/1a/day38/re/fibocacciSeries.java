package day38.re;

public class fibocacciSeries {
    // static int a=0, b=1, c;

    static int fib(int n){

        int a = 0, b = 1, c;
        System.out.print(a+", "+b+", ");

        for(int i=2; i<n; i++){
            c = a+b;
            a=b;
            b=c;
            System.out.print(c+", ");
        }
        return 0;
    }

    static void fib1(int n, int a, int b){
        int c;
        if(n>0){
            c=a+b;
            a=b; 
            b=c;
            
            System.out.print(c+", ");
            fib1(n-1,a,b);
        }
        // return 0;
    }

    static int fib2(int n){
        if(n<0){
            return 0;
        }
        if(n<=1) return 1;
        int result = fib(n-2)+fib(n-1);
        System.out.println(result+", ");
        
        return 0;
    }
    public static void main(String[] args) {
        int n = 10;

        // fib(n);
        // System.out.println("\n");

        // int a=0, b=1;
        // System.out.print(a+", "+b+", ");

        // fib1(n-2,a,b);
        // System.out.println("\n");

        fib2(n);
        System.out.println("\n");

        // System.out.println(fib2(n));
        
    }
}
