package day56;

/**
 * RevseArr
 */
public class RevseArr {

    static int p_arr(int a[]) {
        for (int i : a) {
            System.out.print(i+" ");
        }
        return 0;
    }
    // using temp array.
    static int revseArr(int a[]){
        int b[] = new int[5];
        int n = a.length;
        int j = n;


        for (int i = 0; i < n; i++) {
            b[j-1] = a[i];
            j--;
        }

        System.out.print("\nReverse Array on original element change: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
        System.out.println("\n");
        return 0;
    }
    //using swapping
    static void revSwap(int arr[]){
        int n = arr.length, t;
        for (int i = 0; i < n/2; i++) {
            t = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = t;
        }
    }

    public static void main(String[] args) {
        int max = 4 > 5 ? 4 : 5;  //-> here is write directly 5  
        System.out.println(max);

        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        System.out.print("\nOriginal Arr: ");
        p_arr(arr);
        revseArr(arr);
        System.out.print("Original arr reversed: ");
        revSwap(arr);
        p_arr(arr);

    }
}