package day45;

public class Even {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,5,};
        int countOdd = 0;
        int countEven = 0;

        for (int i = 0; i < arr.length; i++) {

            int temp = (i%2==0) ? countOdd++ : countEven++;
        }
        System.out.println(countOdd + " " + countEven);
    }
}
