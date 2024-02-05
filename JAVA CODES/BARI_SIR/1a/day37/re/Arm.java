package day37.re;


public class Arm {

    static int checkLenDigit(int n) {
        int count = 0;
        while (n != 0) {
            ++count;
            n /= 10;
        }
        return count;
    }

    static int powerOfN(int base, int p){
        int re = 1;
        int count = p;
        while(count>0){
            re *= base;
            count--;
        }
        return re;
    }
    // static boolean arm(int n, int l){
    //     int temp = n;
    //     int re = 0;
    //     while(temp!=0){
    //         re += powerOfN(temp%10, l) ; 
    //         temp/=10;
    //     }

    //     if(re==n) {
    //         System.out.println("Yes");
    //         return true;
    //     }
    //     else {
    //         System.out.println("No");
    //         return false;
    //     }
    //     // return re==n ? true : false;

    // }
    static String arm(int n, int l){
        int temp = n;
        int re = 0;
        while(temp!=0){
            re += powerOfN(temp%10, l) ; 
            temp/=10;
        }
        return (re==n) ? "Yes" : "No";

    }
    public static void main(String[] args) {
        int n = 153;
        int len = checkLenDigit(n);
        arm(n, len);
        System.out.println(arm(n, len));

        System.out.println("This is length of digit : "+len);
        System.out.println("This"+" Number "+n+" is Armstrong are not: ");

        System.out.println();
    }
}
