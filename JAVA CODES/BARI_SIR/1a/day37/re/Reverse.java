package day37.re;
// import java.util.Arrays;

public class Reverse {

    static int checkLenDigit(int n) {
        int count = 0;
        while (n != 0) {
            ++count;
            n /= 10;
        }
        return count;
    }

    static int reverse(int n, int l){
        
        int arr[] = new int[l];
        int count = 0;

        while(n>0){
            // arr[count++] = n%10;
            arr[count] = n%10;
            System.out.print(arr[count++]);
            n/=10;
        }
        // System.out.println(Arrays.toString(arr));
        // for(int i=0; i<l; i++){
        //     System.out.print(arr[i]);
        // }
        return 0;
    }

    static int reverse1(int num){
        int reverse=0;
        while (num != 0)
        {
            reverse = reverse * 10 + num%10;
            num /= 10;
            
        }
        return reverse;
    }
    public static void main(String[] args) {
        int n = 432;        
        int len = checkLenDigit(n);

        System.out.println("This is original number : "+ n);
        System.out.print("This is reverse number : ");
        reverse(n, len);    
        System.out.print(" "+reverse1(n));


    }
}
