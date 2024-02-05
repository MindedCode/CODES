package day45;

public class IncreaseSizeOfArr {
    static int priArr(int arr[]) {
        for (var i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("\n");
        return 0;
    }

    static int insertIndEle(int arr[], int ind) {
        int n = arr.length - 1;
        System.out.println("length of arr : " + arr.length + "\nArr 0 index base hota hai: " + n+"\n");
        for (int i = n; i > ind; i--)
            arr[i] = arr[i - 1];
        arr[ind] = 16;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Hii Ganesh!\n");

        int a[] = new int[5];
        int firstArrSize = a.length;
        System.out.println("Size of First Array : "+firstArrSize);

        int b[] = new int[2 * firstArrSize];
        int secArrSize = b.length;
        System.out.println("Size of Second Array : "+secArrSize+"\n");

        a[0] = 11;
        a[1] = 12;
        a[2] = 13;
        a[3] = 14;
        a[4] = 15;

        priArr(a);
        priArr(b);
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        priArr(b);

        int ind = 5;
        insertIndEle(b, ind);
        priArr(b);
    }
}
