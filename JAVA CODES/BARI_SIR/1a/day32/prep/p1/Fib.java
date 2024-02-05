package day32.prep.p1;

public class Fib {
    // static int a=0, b=1,c; 
    
    // static void fib(int n, int a, int b){
    //     int c;
    //     for(int i=2; i<=n; i++){
    //         c=a+b;
    //         a=b;
    //         b=c;
    //         System.out.print(c+" ");
    //     }
        
    // }
    // static void fib(int n){

    //     // using static function
    //     int c;
    //     for(int i=2; i<n+1; i++){
    //         c=a+b;
    //         a=b;
    //         b=c;
    //         System.out.print(c+" ");
    //     }
    // }

    static void fib(int n, int a, int b){
        if(n>0){
            fib(n-1,a,b);
            System.out.print(c+" ");
            c=a+b;
            a=b;
            b=c;
            return;
        }
        return;
    }

    // if (n > 0)
    //    {
    //   nextTerm = a + b;
    //   a = b;
    //   b = nextTerm;

    //   System.out.print (nextTerm + " , ");
    //   Fib (n - 1);
    //    }
    //  return 0;
    public static void main(String[] args) {
        int a=0, b=1;
        System.out.print(a+" "+ b+" ");
        fib(10,a,b);
    }
}
