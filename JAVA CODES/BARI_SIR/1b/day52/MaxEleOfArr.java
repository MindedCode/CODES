package day52;

import java.util.Arrays;

public class MaxEleOfArr {
    static int pArr(int r[]) {
        int n = r.length;
        int n2 = 4;

        for (int i = 0; i < n2; i++) {
            System.out.print(r[i] + " ");
        }
        System.out.println();

        // for (int i : r) {
        //     System.out.print(i + " ");
        // }

        return 0;
    }

    static int maxEleOfArr(int [] arr){
        // Arrays.sort(arr);
        // int result = arr[arr.length-1];
        // System.out.println(result);

        int max = arr[0];
        for (int i=1; i<arr.length; i++) {
            if(max < arr[i]) max = arr[i];
        }
        System.out.println(max);


        return 0;
    }

    public static void main(String[] args) {
        int max = 5 > 6 ? 5 : 6;
        System.out.println("Max number is : " + max);

        int arr[] = new int[4];

        arr[0] = 40;
        arr[1] = 50;
        arr[2] = 20;
        arr[3] = 90;

        System.out.println(("This is a Arr "));
        pArr(arr);

        System.out.println("Max Element of the arr : ");
        maxEleOfArr(arr);

        System.out.println();
    }
}
