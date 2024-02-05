package day46;

/**
 * TwoDArr only with Adarsh
 */
public class TwoDArr {
    static int pArr(int arr[][]) {
        // for (int[] i : arr) {
        //     for (int j : i) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("\nHii Ganesh!");

        int a[][] = new int[4][6];

        System.out.println("\nEmpty Array:-------------- ");
        pArr(a);

        a[0] = new int[]{1,23,4,5,4,6};
        a[1] = new int[]{1,23,4,5,4,6};
        a[2] = new int[]{1,23,4,5,4,6};
        a[3] = new int[]{1,23,4,5,4,6};
        // a[3] = {1,23,4,5,4,6};   Noo Working

        System.out.println("\nFilled Arr : ---------------");
        pArr(a);

    }
}