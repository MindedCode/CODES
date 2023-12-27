public class Sorting
{
    static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    // Selection (Smallest Element) Sorting
    static void bSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int sm = i;  
            for(int j=i+1; j<arr.length; j++){
                if(arr[sm]>arr[j]){
                    sm = j;
                }
            }
            // Swap
                    int t = arr[sm];
                    arr[sm] = arr[i];
                    arr[i] = t;
        }
    }
	public static void main(String[] args) {
		int arr [] = {2,3,8,3,9,2};
		printArr(arr);
		bSort(arr);
		printArr(arr);
	}
}
