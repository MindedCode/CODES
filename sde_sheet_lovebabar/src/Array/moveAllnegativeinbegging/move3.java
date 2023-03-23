package Array.moveAllnegativeinbegging;

public class move3 {
    public static void main(String[] args) {
        int [] arr = {1,-6,3,4,-2};
//        moveAll(arr);
        int n = arr.length;
        segregateElements(arr,n);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ ",");
        }
    }
    public  static  void segregateElements(int arr[], int n)
    {
        int[]temp=new int[n];

        int i=0;
        for(int k=0;k<n;k++){
            if(arr[k]>=0){
                temp[i]=arr[k];
                i++;
            }
        }
        for(int k=0;k<n;k++){
            if(arr[k]<0){
                temp[i]=arr[k];
                i++;
            }
        }
        for(int j=0;j<n;j++){
            arr[j]=temp[j];
        }
    }
}
