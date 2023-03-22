package Array.SortArr0s1s2s;

import org.w3c.dom.ls.LSOutput;

/*
* no use any sorting algorithms
* */
public class sortArr0s1s2s {
    public static void main(String[] args) {
        int arr[]={0,2,1,1,2,1,1,2,1,2,1,2,0,0,0,0,2};
        sortArr0s1s2s(arr);
    }
    static void sortArr0s1s2s(int arr[]){
        int z=0, o=0, t=0;
        int n = arr.length;
        for (int i=0; i<n; i++){
            if(arr[i]==0)z++;
            if(arr[i]==1)o++;
            if(arr[i]==2)t++;
        }
        for(int i=0; i<z; i++)arr[i]=0;
        for (int i=z; i<z+o; i++)arr[i]=1;
        for(int i=o+z; i<n; i++)arr[i]=2;

        System.out.print("sorted arr ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+",");
        }
    }

}
