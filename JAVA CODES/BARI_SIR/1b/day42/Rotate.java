package day42;

public class Rotate {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9,10};
        for(int i : a) System.out.print(i+" ");

        System.out.println("")
        ;
        
        for (int i = 0; i < 4; i++) {
            int temp = a[0];
            for (int j = 1; j < a.length; j++) {
                a[j-1] = a[j];
            }
            a[a.length-1] = temp;
        }
        

        for(int i : a) System.out.print(i+" ");
    }
}
