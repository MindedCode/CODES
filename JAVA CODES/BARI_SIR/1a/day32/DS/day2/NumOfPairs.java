package day2;

class NumOfPairs{
    public static void main(String [] ar){
        int arr[] = {1,2,3,4,5,6,7,8,12,11,1};
        int k = 12;
        // int pair = 0;

        for(int i : arr) System.out.print(i + " ");
        System.out.println();

        //perform operati
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){

                
                int sum = (arr[i] + arr[j]);
                if(k == sum){
                    System.out.print(arr[i] + " "+arr[j]+" \n");
                    count++;
                }

                // else if(k==arr[i]){
                //     count++;
                // }
            }
        }
        System.out.println(count);
    }
}