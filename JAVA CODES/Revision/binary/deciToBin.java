public class DeciToBin {
    public static void main(String[] args) {
        int deci = 10;
        int binary[] = new int[40];
        int index = 0;
        while (deci > 0) {
            binary[index++] = deci % 2;
            deci /= 2;
        }
        System.out.print("This is  result : ");
        for (int i = index - 1; i >= 0; --i) {
            System.out.print(binary[i]);
        }
    }
}

This is  result : 1010
