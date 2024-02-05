package day44;

public class InsertEleArr {

    static int insert(int arr[], int i){
        System.out.println(arr.length);
        for(int in = 0; in<arr.length-1; in++){
            arr[in+1] = arr[in];
            if(in == i){
                arr[in] = 5;
            }
        }

        for (var each : arr) {
            System.out.print(each+" ");
        }
        System.out.println();

        return 0;
    }
    public static void main(String[] args) {
        int [] a = new int[8];

        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;

        for (var each : a) {
            System.out.print(each+" ");
        }
        System.out.println("\n"+a.length+"\n");
        int index = 0;

        insert(a,index);
    }
}
