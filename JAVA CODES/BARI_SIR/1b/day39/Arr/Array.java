package day39.Arr;

public class Array {
    public static void main(String[] args) {

        int arr[] = new int[5];
        System.out.println(arr.length);

        // int ar[] = {};
        // System.out.println(ar.length);

        // for(int i:ar){System.out.println(i+5);}
        // System.out.println("Adarsh");

        // String s = "Jai Shri Ganesh";
        // System.out.println(s);

        // for(int i:arr){System.out.println(i);}

        // for (var each : arr) {
        //     each++;
        //     System.out.print(each + " ");
        //     // System.out.print(arr.length);
        // }
        // System.out.println();

        // for (int i = 0; i < arr.length; i++) {
        //     // i++;
        //     System.out.print((arr[i] = i) + " ");
        // }
        // System.out.println();

        // for (int i : arr) {
        //     System.out.print(5 - i + " ");
        //     System.out.println(i);
        // }

        // int i[] = new int[7];
        // System.out.println(i.length);

        // int count = 0;
        // for (int j : i) {
        //     j = ++count;
        //     System.out.print(j + " ");
        // }

        // System.out.println();
        // for (int j : i) {
        //     // j = ++count;
        //     System.out.print(j + " ");
        // }

        // System.out.println();
        // for (int k = arr.length - 1; k >= 0; k--) {
        //     System.out.print(i[k] + " ");
        // }

        // System.out.println();
        int array[] = new int[9];

        // for (int l = 0; l < array.length; l++) {
        //     System.out.print((array[l] = l) + " ");

        // }
        // System.out.println();

        // for (int l = 0; l < array.length; l++) {
        //     System.out.print(array[l] + " ");
        // }
        // System.out.println();

        // int ic = 10;
        // for (int l = 0; l < array.length; l++) {
        //     array[l] = (ic++);
        //     System.out.print(array[l] + " ");
        // }

        // System.out.println();
        // for (int l = 0; l < array.length; l++) {
        //     System.out.print(array[l] + " ");
        // }

        System.out.println();
        int c = 4;
        for (int j : array) {
            j = c++;
            System.out.print(j + " ");
        }

        System.out.println();
        for (var each : array) {
            System.out.print(each + " ");
        }

        System.out.println( "System.out.println()" );
    }
}
