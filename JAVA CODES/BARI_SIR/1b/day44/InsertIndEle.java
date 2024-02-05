package day44;

public class InsertIndEle {

    static int printArr(int arr[]) {
        for (var each : arr) {
            System.out.print(each + " ");
        }
        System.out.println("\n");
        return 0;
    }

    static int insertIndEle(int arr[], int ind) {
        int n = arr.length-1;
        System.out.println("length of arr : "+arr.length+"\nArr 0 index base hota hai: "+n);
        for (int i = n; i > ind; i--) 
            arr[i] = arr[i - 1];
        arr[ind] = 9;
        return 0;
    }

    public static void main(String[] args) {
        int a[] = new int[8];

        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;

        printArr(a);
        
        int ind = 7;

        insertIndEle(a, ind);
        printArr(a);


    }
}
