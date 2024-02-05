package day52;

/**
 * Gcd
 */
public class Gcd {

    static int findGcd(int n, int m){
        while(m!=n){
            if(m>n) m-=n;
            else n-=m;
        }
        return m;
    }

    public static void main(String[] args) {
        int max = 5 > 3 ? 5 : 3;
        System.out.println("The result of max number: " + max);

        int result = findGcd(15, 25);
        System.out.println("Result of Gcd: "+ result);
    }
}