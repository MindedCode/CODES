package day47.bari;

public record ProdTwoMatrix() {

    static int pArr(int arr[][]){
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j+" ");
            }System.out.println();
        }
        System.out.println();
        return 0;
    }
    static int productofTwoMatirx(int arr[][], int brr[][], int crr[][] ){
        for (int i = 0; i < crr.length; i++) {
            for (int j = 0; j < crr.length; j++) {
            for (int j2 = 0; j2 < crr.length; j2++) {    //same row and col size.
                // crr[i][j] = crr[i][j] + (arr[i][j2] * brr[j2][j]);
                crr[i][j] += arr[i][j2] * brr[j2][j];
            }
           } 
        }
        System.out.println();
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("\nHii Ganesh!");

        int a[][] = new int[2][];

        a[0] = new int[] { 1, 2 };
        a[1] = new int[] { 3, 4 };

        System.out.println("Printing First 2D Arr:");
        pArr(a);

        int b[][] = new int[2][];

        b[0] = new int[] { 2, 2 };
        b[1] = new int[] { 2, 2 };

        System.out.println("Printing Second 2D Arr:");
        pArr(b);

        System.out.println("Printing only empty matrx:");
        int c[][] = new int [2][2];
        pArr(c);

        productofTwoMatirx(a, b, c);
        System.out.println("Product Output of the Two Marix / 2D arrays");
        pArr(c);



    }

}
