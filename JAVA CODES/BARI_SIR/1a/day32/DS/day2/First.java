package day2;

class First{
    public static void main(String args[]){
        int arr[] = new int[11];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 19;
        arr[10] = 11;

        for(int i : arr){
            System.out.print(i+ " "); 
        }

        System.out.println();

        for(int i=0; i<arr.length; i++){
            System.out.print(i+ " "); 
        }
        System.out.println();System.out.println();

        //perform operations
        for(int i=0; i<arr.length; i++){
            if(i % 2 != 0) arr[i]*=2;
            else arr[i]+=10;
        }

        System.out.println();

        for(int i: arr){
            System.out.print(i+"  ");
        }
        System.out.println();

        for(int i=0; i<arr.length; i++){
            System.out.print(i+ " "); 
        }

    }
}