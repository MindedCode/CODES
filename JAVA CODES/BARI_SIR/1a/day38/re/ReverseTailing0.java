package day38.re;

public class ReverseTailing0 {

    static void reverseTailing0(int n) {
        String s = "";
        int digit = 0;

        while (n > 0) {
            digit = n % 10;
            switch (digit) {
                case 0: System.out.print("Zero "); break;
                case 1: System.out.print("One "); break;
                case 2: System.out.print("Two "); break;
                case 3: System.out.print("Three "); break;
                case 4: System.out.print("Four "); break;
                case 5: System.out.print("Five "); break;
                case 6: System.out.print("Six "); break;
                case 7: System.out.print("Seven "); break;
                case 8: System.out.print("Eight "); break;
                case 9: System.out.print("Nine "); break;
                default: System.out.print("Invalid digit");
            }
            n /= 10;
            s = digit + s;  // Reverse the order
        }

        System.out.println("\nThis number is reverse with leading zeros: " + s + "\n");
    }

    static void reverseTailingFirst(int n) {
        String s = "";
        int digit = 0;

        while (n > 0) {
            digit = n % 10;
            s = digit + s;  // Reverse the order
            n /= 10;
        }

        System.out.println(s);

        char c;
        for (int i = s.length() - 1; i >= 0; i--) {
            c = s.charAt(i);
            switch (c) {
                case '0': System.out.print("Zero "); break;
                case '1': System.out.print("One "); break;
                case '2': System.out.print("Two "); break;
                case '3': System.out.print("Three "); break;
                case '4': System.out.print("Four "); break;
                case '5': System.out.print("Five "); break;
                case '6': System.out.print("Six "); break;
                case '7': System.out.print("Seven "); break;
                case '8': System.out.print("Eight "); break;
                case '9': System.out.print("Nine "); break;
                default: System.out.print("Invalid digit"); break;
            }
        }
    }

    public static void main(String[] args) {
        int n = 1200;
        System.out.println(n);
        reverseTailing0(n);
        reverseTailingFirst(n);
        System.out.println("\n");
    }
}
