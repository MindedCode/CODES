package day2;

class K{
    public static void main(String [] ar){
        int arr [] = {1,2,3,4,5,6,7};
        int k = 4;

        for(int i : arr) System.out.print(i+" ");
        System.out.println();

        // perform op
        int count = 0;
        for(int i: arr){
            if(i>4) ++count;
        }
        System.out.print(count+" ");
    }
}