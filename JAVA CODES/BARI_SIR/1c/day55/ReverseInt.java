package day55;


public class ReverseInt {
    static int reverseInt(int n) {
        int result = 0;
        int count = 0;
        while (n > 0) {
            result = result + n % 10 * (int) Math.pow(n, count);
            n /= 10;
        }
        return result;
    }

    // no use count and pow predefined functions
    static int reveseNub(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int max = 4 > 125 ? 4 : 125;
        System.out.println(max);

        int result = reverseInt(max);
        // if (max == result)
        //     System.out.println("True");
        // else
        //     System.out.println("false");
        System.out.println(result);


        System.out.println("Hii"+reveseNub(max));
    }
}
