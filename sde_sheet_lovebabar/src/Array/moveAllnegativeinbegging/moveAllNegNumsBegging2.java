package Array.moveAllnegativeinbegging;

public class moveAllNegNumsBegging2 {
    public static void main(String[] args) {
        int [] arr = {1,-6,3,4,-2};
//        moveAll(arr);
        move2(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ ",");
        }
    }
    static void move2(int arr[]){
        int j = 0, temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
}