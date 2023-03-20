package Array;

import java.util.Arrays;

public class ReveseArrRecursion {
    public static void main(String[] args) {
        int arr[]={1,2,5,6,3,4,5};
        int n = arr.length;
        reverseArr(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }

    static void reverseArr(int arr[], int start, int end){
//        look condition
        if(start>end)return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArr(arr, start+1, end-1);
    }

}
