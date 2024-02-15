package day57;

public class checkVarArgsArrMax {
    // static int max(int a[]){   // error bcoz arr a is VarArgs only no arr
    static int max(int ...a){
        if(a.length == 0) return Integer.MIN_VALUE;
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i]>max)max = a[i];
        } return max;
    }

    // static double max(double ...a){
    //     if(a.length == 0) return Double.MIN_VALUE;
    //     double max = a[0];
    //     for (int i = 1; i < a.length; i++) {
    //         if(a[i]>max)max = a[i];
    //     } return max;
    // }

    static int sum(int ...a){
        int sum = 0;
        for (int i : a) {
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int max = 4>5 ? 4 : 5;
        System.out.println(max);
        System.out.println(max());
        System.out.println(max(10,45,20,69,78,46));

        //with sum function VarArgs
        System.out.println();
        System.out.println(sum());
        System.out.println(sum(1,2,3,4,5));
        // System.out.println(max(10.2,45.4,20.5,69.6,78.5,46.6));
    }
}
