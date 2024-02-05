package day2;

class EvenNOddIndices{
    public static void main(String[] ar){
        int arr[] = {1,3,5,7,9,11};
        
        for(int i : arr) System.out.print(i+" ");
        System.out.println();

        int EvenSum=0;
        int oddSum=0;
        int EvenOddDiff=0;

        // for(int i=0; i<arr.length; i++){
        //     if(i%2 == 0){
        //         EvenSum += arr[i];
        //     } else {
        //         oddSum += arr[i];
        //     }
        // }
        for(int i : arr){
            if(i%2 == 0){
                EvenSum+=arr[i];
                // System.out.println(i + " " + EvenSum);
            } 
            else {
                oddSum+=arr[i];
                // System.out.println(i + " "+ oddSum);
            }
        }
        System.out.print("\nEven and Odd Differences: ");

        EvenOddDiff = EvenSum-oddSum;

        System.out.print(EvenSum +" " +oddSum + " " + EvenOddDiff+"\n");


    }
}