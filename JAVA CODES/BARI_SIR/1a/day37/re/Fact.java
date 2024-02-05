package day37.re;

public class Fact {
    static int fact(int n){
        long fact = 1;
        for(int i=n; i>1; i--){
            System.out.println(i+" "+(fact*=i));
        }
        return 0;
    }
    public static void main(String[] args) {
        int n=5; fact(n);
    }
}
