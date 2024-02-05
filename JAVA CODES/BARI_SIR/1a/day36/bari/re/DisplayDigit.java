package day36.bari;

public class DisplayDigit {
    static int len(int n){
        int count=0;
        while (n!=0) {
            ++count;
            n/=10;
        }
        return count;
    }
    public static void main(String[] args) {

        int n=153;
        int result;
        int digitsLength = len(n);
        // System.out.println(digitsLength);
        
        while (n>=0) {
            int t = n;
            result += n%10*pow(); 
        }

            // // display digits
            // int count = 0;
            // int n = 1234;
            // while (n > 0) {
            //     System.out.println(n % 10);
            //     ++count;
            //     n /= 10;
            // }
            // System.out.println("This number is present digits : "+count);
    }
}
