package Array.MinAndMax;

public class MinAndMin {
    public static void main(String[] args) {
        int arr[]= {6,4,2,5,67,72,5,2,2};
//        int n = arr.length;
        findMinAndMax(arr);
    }
    static void findMinAndMax(int arr[]){
        if(arr==null||arr.length==0)return;
        int min = arr[0];
        int max = arr[0];
        for(int i=1 ; i<=arr.length; i++){
            if(arr[i]<arr[min]){
                min = arr[i];
            }
            if(arr[i]>arr[max]){
                max = arr[i];
            }
//            min = Math.min(min,arr[i]);
//            max = Math.max(max, arr[i]);
        }
        System.out.println(max+"=minimum");
        System.out.println(min+"=maximum");
    }
}
