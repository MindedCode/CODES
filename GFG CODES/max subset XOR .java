public static int maxSubsetXOR(int arr[], int N)
    {
        //add code here.
        // int ind = 0;
        // for(int i = 31; i>=N; i--){
        //     int maxI = ind;
        //     int maxE = Integer.MIN_VALUE;
        //     for(int j = ind; j<N; j++){
        //         if((arr[j]&(1<<i))!=0 && arr[j]>maxE){
        //             maxE = arr[j];
        //             maxI = j;
        //         }
        //     }
        //     if(maxE == Integer.MIN_VALUE)
        //         continue;
        //     int t = arr[ind];
        //     arr[ind] = arr[maxI];
        //     arr[maxI] = t;
        //     maxI = ind;
        //     for(int j=0; j<N; j++){
        //         if(j!=maxI && (arr[j] & (1<<i)) != 0)
        //         arr[j] = arr[j] ^ arr[maxI];
        //     }
        // ind++;
        // }
        int result = 0; 
        for(int i = 0; i<N; i++)
            result ^= arr[i];
        return result;
    }
