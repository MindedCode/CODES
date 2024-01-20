package day45;

/**
 * JaggedArr
 */
public class JaggedArr {

    static void priArr(int arr[][]){
        for (int [] each : arr) {
            for (var ej : each) {
                System.out.print(ej+" ");
            }System.out.println();
        }System.out.println();

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }
    }
    public static void main(String[] args) {
        System.out.println("\nHii Ganesh!");
        int a[][] = new int[10][];

        a[0] = new int[10];
        a[1] = new int[4];
        a[2] = new int[3];
        a[3] = new int[2];
        a[4] = new int[3];
        a[5] = new int[4];
        a[6] = new int[5];
        a[7] = new int[6];
        a[8] = new int[7];
        a[9] = new int[8];

        priArr(a);
        int b[][] = new int[10][];

        // jaggedArray[0] = new int[]{1, 2, 3};
        b[0] = new int[]{1,2,3,4,5,6,7,8,9,10};
        b[1] = new int[]{7,6,5,4,3,2,1};
        b[2] = new int[]{5,4,3,5,4,3,5,6};
        b[3] = new int[]{5,4,3,5,6,25};
        b[4] = new int[]{5,4,32};
        b[5] = new int[]{5,4,3,5,5,4,3,2,5,3,2,4,2,4,0,0,0,0,0,0,0,0,00,00,0,00};
        b[6] = new int[]{5,4,3,5,6,2};
        b[7] = new int[]{5,4,3,5,6,2,8,7,};
        b[8] = new int[]{54,7,42,54,3,6,6};
        b[9] = new int[]{5,9,5,4,3,5,4,8,7,9};
        System.out.println("Second Array is display:====================");
        priArr(b);

        int c[][] = { {1,2,3,4}, {}, {4,5,6}, {56,3,4,5,5,3,43,42}, {43,4} };

        System.out.println("Third Array is display: ========");

        priArr(c);
    }

}
