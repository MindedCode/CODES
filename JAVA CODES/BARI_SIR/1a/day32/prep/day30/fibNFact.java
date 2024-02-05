package day30;

class fibNFact{
    // static int a=0, b=1, c;
    // static void fib(int a){
    //     int x = 0, y = 1;
    //     System.out.print(x+" "+y+" ");

    //     int c;
    //     for(int i=2; i<a; i++){
    //         c=x+y;
    //         x=y;
    //         y=c;
    //         System.out.print(c+" ");
    //     }
    // }

    // static int fib(int n){
    //     if(n>0){
    //         c=a+b;
    //         a=b;
    //         b=c;
            
    //         System.out.print(c+" ");
    //     fib(n-1); 
    //     } return 0;   
    // }
    static int fib(int n){
        if(n==0){
             return 0;
        }else if(n==1) return 1;
        else return fib(n-1)+fib(n-2);
        // return 0;
    }
    
    public static void main(String[] args) {
        
        // int a=0, b=1;
        // System.out.print(a+" "+b+" ");
        System.out.print(fib(6)+" ");
        
        // fib(6);

    }
}