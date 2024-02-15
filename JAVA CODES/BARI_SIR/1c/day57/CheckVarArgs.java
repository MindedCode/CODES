package day57;

public class CheckVarArgs {
    static void show(int... x) {
        for (int i : x) {
            System.out.print(i + " ");
        }
        return;
    }

    // static void show(int [] x) {
    //     for (int i : x) {
    //         System.out.print(i + " ");
    //     }
    //     return;
    // }

    public static void main(String[] args) {
        int max = 5 > 4 ? 5 : 4;
        System.out.println(max);

        show();
        show(10, 5, 4);
        show(new int[]{2,3,4,5,56});

    }
}
