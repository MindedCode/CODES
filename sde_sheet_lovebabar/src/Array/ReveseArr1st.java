package Array;

import java.util.Arrays;

public class ReveseArr1st {

   public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
       int temp[] = new int[5];


       System.out.println(Arrays.toString(arr));
       reverseArr(arr,temp);
       System.out.println(Arrays.toString(temp));


        }
//        method 1st
//    static void reverseArr(int [] arr){
//        int n= arr.length;
//
//
//        for(int i=n-1; i>=0; i-- ) {
//            System.out.print(arr[i]+",");
//
//        }
    static void reverseArr(int [] arr, int temp[]){
        int n= arr.length;

        for(int i=0; i<n; i++){
            temp[i]=arr[n-1-i];
//            System.out.print(temp[i] + ",");
        }


    }
}
