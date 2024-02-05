package day38.re;

public class ArithematicProgressionSeries {

    static int arithematicProgressionSeries(int n, int a, int d){
        
        for(int i=0; i<n; i++){
            System.out.print(a+" ");
            a = a+d;
            //a = term
        }
        return 0;
    }
    public static void main(String[] args) {
        int n = 5;
        int first = 3;
        int cmmonDiff = 4;  // first+commonDiff ==> Add kiya jata h.
        // formula is : a+ ad + a2d + a3d +....
        
        System.out.print("This series is: Arithmetic Progression(AP) : ");
        arithematicProgressionSeries(n, first, cmmonDiff);
        System.out.println("\n");

        
    }
}
