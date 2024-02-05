package prep;

public class Fib {
    // static void fib(int n, int a, int b){
    //     int i=2;
    //     while(i<n){
    //         int c = a+b;
    //         a=b;
    //         b=c;
    //         System.out.print(c+" ");
    //         i++;
    //     }
    // }

    // static int a=0, b=1;
    // static void fib(int n){
    //     int c;
    //     for(int i=2; i<n; i++){
    //         c=a+b;
    //         a=b;
    //         b=c;
    //         System.out.print(c+" ");
    //     }
    // }

    // static int a=0, b=1,c;
    // static int fib(int n){
    //     if(n!=0){
    //         c=a+b;
    //         a=b;
    //         b=c;
    //         System.out.print(c+" ");
    //         fib(n-1);
    //     }
    //     return 0;
    // }

    // using arr
    // static void fib(int n){
    //     int c[] = new int [5];
    //     c[0] = 0;
    //     c[1] = 1;
    //     System.out.print(c[0]+" "+c[1]+" ");

    //     for(int i=2; i<n; i++){
    //         c[i] = c[i-2]+c[i-1];
    //         System.out.print(c[i]+" ");

    //     }
    // }
    static int fib(int n)
	{
		if (n <= 1)
			return n;
        System.out.print(n+" ");
		return fib(n - 1)+fib(n-2);
	}
    public static void main(String[] args) {
        System.out.println("JAi Shree Ganesh!");

        int n = 5;
        // int a=0, b=1;
        // System.out.print(a+" "+b+" ");
        // fib(n,a,b);
        // fib(n-2);
        // fib(n);
        System.out.println(n+" Fib "+fib(n));
    }
}
