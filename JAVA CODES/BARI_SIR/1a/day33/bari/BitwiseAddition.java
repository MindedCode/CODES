package Lecs.day33.bari;

public class BitwiseAddition {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        int sum, carry;
        do {
            // XOR gives the sum of bits without considering the carry
            sum = a ^ b;

            // AND and left shift give the carry
            carry = (a & b) << 1;

            // Update a and b for the next iteration
            a = sum;
            b = carry;
        } while (b != 0);

        System.out.println("Sum: " + sum);

        // int a = 5;
        // int b = 7;

        // while (b != 0) {
        //     int carry = (a & b) << 1;
        //     a = a ^ b;
        //     b = carry;
        // }

        // System.out.println("Sum: " + a);
    }
}
