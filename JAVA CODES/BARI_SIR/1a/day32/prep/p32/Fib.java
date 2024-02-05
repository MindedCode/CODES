package day32.prep.p32;

public class Fib {
    // static int a=0, b=1,c;

    // static void fib(int n,int a, int b){
    //     int c;
    //     for(int i=2; i<n; i++){
    //         c=a+b;
    //         a=b;
    //         b=c;
    //         System.out.print(c+" ");
    //     }
    // }
    
    // static void fib(int n){
    //     for(int i=2; i<n; i++){
    //         int c;
    //         c=a+b;
    //         a=b;
    //         b=c;
    //     System.out.print(c+" ");
    //     }   
    // }

    // using recursion
    // static int fib(int n){
    //     if(n>0){
    //         c=a+b;
    //         a=b;
    //         b=c;
    //         System.out.print(c+" ");
    //         fib(n-1);
    //     }return 0;
    // }

    // using array
    // static int fib(int n){
    //     int arr[] = new int[n];

    //     for(int i=0; i<n; i++){
    //         arr[i] = a+b;
    //         a = b;
    //         b=arr[i];
    //         System.out.print(arr[i]+" ");
    //     }
    //     return 0;
    // }

    // using array 2
    // static int fib(int n){
    //     int arr[] = new int[n];
    //     arr[0] = 0;
    //     arr[1] = 1;
    //     System.out.print(arr[0]+" "+arr[1]+" ");

    //     for(int i=2; i<n; i++){
    //         arr[i] = arr[i - 1] + arr[i - 2];
    //         System.out.print(arr[i]+" ");
    //     }
    //     return 0;
    // }

    // using direct formula
    static void fib(int n, double phi){
        for(int i=0; i<=n; i++){
            System.out.print(Math.round(Math.pow(phi, i) / Math.sqrt(5)) + " ");
        }
    }
    public static void main(String[] args) {
        int n = 10;
        // System.out.print(a+" "+b+" ");
        // fib(n,a,b);
        // fib(n-2);
        // fib(n);
        double phi = (1 + Math.sqrt(5)) / 2;
        fib(n, phi);
    }
}
