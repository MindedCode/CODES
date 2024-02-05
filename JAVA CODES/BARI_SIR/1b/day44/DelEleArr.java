package day44;

public class DelEleArr {

    static void printArr(int arr[]){
        for (int i : arr) {
            System.out.print(i+" ");
        }

        // int n = arr.length;
        // for(int i=0; i<n; i++){
        //     System.out.print(arr[i]+" ");
        // }
    }

    static int delEleArr(int arr[], int n, int i){
        if(arr[i] == i){

        }

        return 0;
    }

    static int InsertEleArr(int arr[], int n, int i){
        
        for (int index = 0; index < n; index++) {
            if(index == i){
                arr[index] = 6;
            }
        }

        for (var each : arr) {
            System.out.print(each+" ");
        }System.out.println();
        return 0;

    }
    public static void main(String[] args) {

        // array ko insert krne se pahle it make sure array is size is more availble.
        // int arr[] = {1,2,3,4,5};
        int arr[] = new int[10];

        

        int n = arr.length;

        int index = 9;

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;


        System.out.println("\n");
        printArr(arr);
        System.out.println();
        InsertEleArr(arr,n, index);
        // n--;
        System.out.println("\nsfgjfgs");

        // printArr(arr);

        // printArr(arr);
        // // delEleArr(arr,n, index);
        // n--;
        // printArr(arr);
    }
}
