package day41;

public class RotateArr {
    static int rotateArr(int a[],int l, int k){
        int temp = a[0];
        for (int i = 0; i < a.length; i++) {
            a[i-1] = a[i];
        }
        a[l-1] = temp;
        
        for (var each : a) {
            System.out.println(each+" ");
        }
        return 0;

    }
    public static void main(String[] args) {
        int a[] = {1,7,8,10,12,34,56,6,76,87};
        int len = 0;
        int key = 4;
        // System.out.println(len=arr.length);

        for (var each : a) {
            System.out.format("%-2d ",each);
        }
        // System.out.println();
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.format("%-2d ", i);
        // }

        System.out.println("\n");

        int temp = a[0];
        for (int i = 0; i < a.length; i++) {
            a[i-1] = a[i];
        }
        a[len-1] = temp;
        
        for (var each : a) {
            System.out.println(each+" ");
        }
        // return 0;

        // rotateArr(arr, len,key);

    }
}
