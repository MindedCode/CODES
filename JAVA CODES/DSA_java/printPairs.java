/*
print pairs of Arr 
[2,3,45,6,7,8]

(2,3) (2,45) (2,6) (2,7) (2,8)
(3,45) (3,6) (3,7) (3,8)
(45,6) (45,7) (45,8)
(6,7) (6,8)
(7,8)

*/



class Main{
    
    static void pairs(int arr[]){
        for(int i=0; i<arr.length; i++){
            int curr = arr[i];
            for(int j = i+1; j<arr.length; j++){
                System.out.print("(" + curr + "," +arr[j]+"), ");
            }
            System.out.println();
        }
    }
    public static void main (String[] args) {
        int arr[] = {2,3,45,6,7,8};
        
        pairs(arr);
        
    }
} 


"Output of the Program""
  
  
(2,3), (2,45), (2,6), (2,7), (2,8), 
(3,45), (3,6), (3,7), (3,8), 
(45,6), (45,7), (45,8), 
(6,7), (6,8), 
(7,8)
