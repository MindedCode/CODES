package day41;

public class SecLargest {
    static int secLar(int arr[]){
        int max,secMax,thirdMax;
        max = secMax = thirdMax = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                thirdMax = secMax;
                secMax = max;
                max = arr[i];
            }
            else if(arr[i]>secMax){
                thirdMax = secMax;
                secMax = arr[i];
            }
            else if(arr[i]>thirdMax)
            thirdMax = arr[i];

        } System.out.println("3rd largest number: "+thirdMax+"\nSec largest element : "+secMax+"\nlargest ele: "+max);

        return 0;

    }
    public static void main(String[] args) {
        // int arr[] = new int[19];
        int arr[] = {1,3,0,6,5,8,10,4,15};

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print((arr[i] = i+1)+" ");
        // }
        System.out.println();

        for (var each : arr) {
            System.out.print(each+" ");
        }
        System.out.println();
        secLar(arr);
        
    }
}
