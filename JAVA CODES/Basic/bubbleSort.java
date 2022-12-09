public class Main
{
    
public static void printArr(int arr[]){
	for(int i=0; i<arr.length; i++){
	System.out.print(arr[i]+ " ");
	}} 
	
	public static void main(String args[]){
	int arr[] = {3,6,7,1,9,8,4,1,5};


        for(int i =0; i<arr.length-1; i++){	    // 0,1,2
        	for(int j=0; j<arr.length-i-1; j++){  //    	0,1
        		if(arr [ j ] >arr[ j+1 ]){
        			int temp = arr[ j ];
        			arr[ j ] = arr[ j+1 ];
        			arr[ j+1] =temp;
        			}
        		}
        	}
        printArr(arr);
        // }
	}
}

Output of the program:

1 1 3 4 5 6 7 8 9 
  
  
  
  Explanation :: 

bubble sort -

367198415       length = 9;

public static void printarr(int arr[]){
	for(int i=0; i<arr.length; i++){
	System.out.println(arr[j]);
	}}
public static void main(String args[]){
	int arr[] = {367198415};
for(int i =0; i<arr.length-1; i++){	     0,1,2
	for(int j=0; j<arr.length-i-1; j++){      	0,1
		if(arr [ j ] >arr[ j+1 ]){
			int temp = arr[ j ];
			arr[ j ] = arr[ j+1 ];
			arr[ j+1] =temp;
			}}}
printarr(arr);
} 

i =0-------------------------------------------
1--	367198415      j=0	367198415	j=1	367198415	j=2	361798415	j=3	361798415	j=4	361789415	j=5	361784915	j=6	361784195	j=7	361784159	j = 0...7 times

i=1 -------------------------------------------------
2--	361784159	j=0	361784159	j=1	316784159	j=2	316784159	j=3	316784159 	j=4	316748159	j=5	316741859	j=6	316741589					j = 0...6 times.
      
i=2 -------------------------------------------
3-- 	316741589 	j=0	136741589	j=1	136741589	j=2	136741589	j=3	136471589	j=4	136417589	j=5	136415789									j = 0...5 times	

i =3 -------------------------------------------
4--	136415789	j=0 	136415789	j=1	136415789	j=2	134615789	j=3	134165789	j=4	134156789													j = 0...4 times

i=4 ------------------------------------------
5--	134156789	j=0	134156789	j=1	134156789	j=2	131456789	j=3	131456789				j=0...3 times

i= 5------------------------------------------
6--	131456789	j=0	131456789	j=1	113456789	j=2	113456789

i=6 ------------------------------------------
7--	113456789	j=0	113456789	j=1	113456789	

i=7------------------------------------------
8-- 	113456789	j=0	113456789

Final output is =>  113456789
