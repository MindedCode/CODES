package day45;

public class CpyArr {
    public static void main(String[] args) {
        System.out.println("Adarsh\n");

        int a[] = new int[5];

        int b[] = new int[5];

        a[0] = 11;
        a[1] = 12;
        a[2] = 13;
        a[3] = 14;
        a[4] = 15;
        b[0] = 1;
        b[1] = 2;
        b[2] = 3;
        b[3] = 4;
        b[4] = 5;

        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : b) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        for (int i : b) {
            System.out.print(i + " ");
        }
    }
}
