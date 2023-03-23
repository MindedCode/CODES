package Array.moveAllnegativeinbegging;

public class moveAllNegNumsBegging {
    public static void main(String[] args) {
        int [] arr = {-1,-6,-3,-4,-7,2,5,4,-3,-6,6,6,6};
//        moveAll(arr);
//        move2(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ ",");
        }
    }
    static  void moveAll(int arr[]){
        int left=0, right=arr.length-1;
        while(left<right){
            while(arr[left]<0)left++;
            while(arr[right]>0)right--;

            if(left>=right)break;
            //Swaping right position -ve nums
            int temp=arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }

    }
}
