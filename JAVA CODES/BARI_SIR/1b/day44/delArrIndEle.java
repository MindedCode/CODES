package day44;

public class delArrIndEle {
    
    static int printArr(int arr[]) {
        for (var each : arr) {
            System.out.print(each + " ");
        }
        System.out.println("\n");
        return 0;
    }

    static int insertIndEle(int arr[], int ind) {
        int n = arr.length-1;
        // int n = 4;
        

        for (int i = ind; i < n; i++) 
            arr[i] = arr[i+1];
        return 0;
    }

    public static void main(String[] args) {
        int a[] = new int[8];

        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;

        printArr(a);
        
        int ind = 1;
        int n = a.length-1;
        System.out.println("length of arr : "+a.length+"\nArr 0 base index hota hai: "+n+"\n");

        insertIndEle(a, ind);
        insertIndEle(a, ind);
        insertIndEle(a, ind);
        printArr(a);
    }
}
