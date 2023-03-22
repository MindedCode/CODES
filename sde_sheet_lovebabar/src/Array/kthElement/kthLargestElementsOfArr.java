package Array.kthElement;

import java.util.Arrays;

public class kthLargestElementsOfArr {
    public static void main(String[] args) {
        int [] arr = {6,2,5,5,2,25,6262,24,244};
        int key = 5;
        System.out.println("Array:");
        for(int i =0; i<arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        kthLargest(arr, key);
    }
    static  void kthLargest(int [] arr, int key){
        int n = arr.length;
//        int [] array = new int[key];
        Arrays.sort(arr);
        System.out.print("\nSorted Element: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+",");
        }
        for(int i=0; i<key; i++){
            arr[i]= arr[n-i-1];
        }
        System.out.print("\n"+key+"largest elements :");
        for(int i=0; i<key; i++){
            System.out.print(arr[i]+",");
        }
    }
}
