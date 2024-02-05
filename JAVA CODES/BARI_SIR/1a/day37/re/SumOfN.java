package day37.re;

public class SumOfN {
    static int sumOfN(int n){
        int sum=0;
        for(int i=1; i<n+1; i++){
            System.out.println(i+" " + (sum+=i));
        }
        return 0;
    }
    public static void main(String[] args) {
        int n=10;
        sumOfN(n);
    }
}
