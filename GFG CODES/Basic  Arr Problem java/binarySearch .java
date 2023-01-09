
class Solution {
    int binarysearch(int arr[], int n, int key) {
        // code here
        for(int i=0; i<n; i++){
            
            int  start =0;
            int end = n-1;
           
            while(start <= end){
                
                int mid = (start+end)/2;
                
                if(arr[mid]<key){
                    start = mid+1;
                   
                }
                else if(arr[mid]==key){
                     return mid;
                }
                else 
                    end = mid-1;
            }
        }
            return -1;
    }
}
