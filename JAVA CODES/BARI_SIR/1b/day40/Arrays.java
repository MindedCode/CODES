package day40;

public class Arrays {
    public static void main(String[] args) {
        // int p[] = new int[5];
        // int []a = new int[5];

        // for (var each : p) {
        // System.out.print(each+" ");
        // }
        // System.out.println();

        // for( int i : a){
        // System.out.print(i+" ");
        // }

        // System.out.println();
        // System.out.println(a.length);
        // System.out.println(p.length);

        // byte b [] = new byte[5];
        // System.out.println(b);
        // short bt[] = new short[7];
        // System.out.println(bt);
        // char cb[] = new char[6];
        // System.out.println(cb);
        // double ch [] = new double[9];
        // System.out.println(ch);

        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        // int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print((sum += (arr[i])) + " ");
        // }

        // System.out.println();
        // System.out.println(arr[3]);

        for (var each : arr) {
            System.out.println(each);
        }

        for (var each : arr) {
            if (each == 3) {
                System.out.println("Yes Present in ");
                System.exit(2);
                
            }   
        }System.out.println("Not ");
        // sum = 0;System.out.println();
        // for (var each : arr) {
        //     sum += each;
        // }

        // System.out.println(sum);


        // sum = 0;
        // for (var i = 0; i < arr.length; i++) {
        //     sum += arr[i];
            
        // }
        // System.out.println(sum);

    }
}
