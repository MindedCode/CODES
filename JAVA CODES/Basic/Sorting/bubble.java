public class Sorting
{
    static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    // bubble Sorting
    static void bSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){  
                    // Swap
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
    }
	public static void main(String[] args) {
		int arr [] = {2,3,8,3,9,2};
		printArr(arr);
		bSort(arr);
		printArr(arr);
	}
}
