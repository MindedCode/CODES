package day50;

public class Prime {

    int prime(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0)
                ++count;
        }
        return count == 1 ? 1 : 0;
    }

    boolean prime1(int n) {

        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i < n / 2; i++)
            if (n % i == 0)
                return false; // n is divisible by i, so it's not prime
        return true;
    }

    public static void main(String[] args) {
        Prime p = new Prime();
        System.out.println(p.prime(9));
        System.out.println(p.prime1(99));
    }
}
