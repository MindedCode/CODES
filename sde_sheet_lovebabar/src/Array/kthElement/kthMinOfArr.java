package Array.kthElement;

import java.util.Arrays;

public class kthMinOfArr {
    public static void main(String[] args) {
        int [] arr = {6,2,5,5,2,25,6262,24,244};
        int key = 5;
        Arrays.sort(arr);
        for(int i =0; i<arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println("\n"+key+" smallest number => "+arr[key-1]);
    }
}
