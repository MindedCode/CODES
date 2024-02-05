package day53;

public class CheckArr {
    public static void main(String[] args) {
        int max = 5>6 ? 5 : 6;
        System.out.println("This Max element : "+max);

        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print((arr[i] = i+5)+" ");
        }

        System.out.println();

        
        // bcoz for each loop only use the >>>==>> Read the Elements of array

        arr[1] = 20;
        for (int i : arr) {
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println(arr+"\n");
        // System.out.println(arr+1);       // bcoz java me substringMethod hota hai.
    }
}
