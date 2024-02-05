package day46;

public class AddMatrix {
    static int pArr(int arr[][]) {
        for (int i[] : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        return 0;
    }

    static void addMarix(int ar[][], int br[][]) {

        int rw = ar.length;
        int cl = ar[0].length;

        int[][] sum = new int[rw][cl];

        int i = 0;
        for (int[] row : ar) {
            // Using for-each loop to iterate over elements in each row
            int j = 0;
            for (int element : row) {
                sum[i][j] = element + br[i][j];
                j++;
            }
            i++;
        }

        // this loop is not working for each loop
 
        // for (int[] i : ar) {
        // for (int j : i) {
        // sum[j] = ar[i][j] + br[i][j];
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < sum.length; i++) {
        // for (int j = 0; j < sum[i].length; j++) {
        // sum[i][j] = ar[i][j] + br[i][j];
        // }
        // }
        pArr(sum);
    }

    public static void main(String[] args) {
        System.out.println("\nHii Ganesh!");

        int a[][] = { { 1, 1 }, { 1, 1 } };
        int b[][] = { { 1, 1, }, { 1, 1 } };

        System.out.println("\nFirst arr:");
        pArr(a);
        System.out.println("\nSecond Arr: ");
        pArr(b);

        System.out.println("\nResult of adding two arrays :");
        addMarix(a, b);

    }
}
