package day38.re;
//first me common diff ko multiply kiya jata h.

public class GeometricProgression {

    static int geometricProgression(int n, int a, int r){
        //term = a;
        // nth = n
        // common ratio = r
        // formula is : a + ar + ar2 + ar3+...

        for(int i=0; i<n; i++){
            System.out.print(a+", ");
            a *= r;
        }
        return 0;
    }
    public static void main(String[] args) {
        int n = 5;
        int first = 3;
        int commonRatio = 3;
        geometricProgression(n, first, commonRatio);
        System.out.println("\n");


    }
}
