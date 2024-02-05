package day38.re;

/**
 * Palindrome
 */
public class Palindrome {
    
    static int palindrome(int n){
        int reverse = 0;

        while (n>0) {
            reverse = reverse * 10 + n%10;
            n/=10;
        }
        // System.out.println(reverse);
        return reverse;
    }

    public static void main(String[] args) {
        
        int n = 434;
        if(palindrome(n)==n) System.out.println("Yes Number is palindrome");
        else System.out.println("Not number is palindrome.");

    }
}