package day45;

public class ReverseCpyArr {


    // Two pointer Approach 
    
    static void re(int a[], int b[]){
        int n = a.length-1;
        for (int i = n, j=0; i >= 0; i--, j++) {
            b[j] = a[i];
            // b[j] = b[i];
        }
    }
    static int priArr(int arr[]) {
        for (var i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("\n");
        return 0;
    }

    static int reverseCpyArr(int arr[], int brr[]) {
        int n = arr.length - 1;
        for (int i = 0; i <= n; i++)
            brr[n - i] = arr[i];
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Hii Ganesh!\n");

        int a[] = new int[5];
        int b[] = new int[5];

        a[0] = 11;
        a[1] = 12;
        a[2] = 13;
        a[3] = 14;
        a[4] = 15;

        priArr(a);
        priArr(b);

        reverseCpyArr(a, b);
        priArr(b);

        re(a,b);
        priArr(b);

    }
}
