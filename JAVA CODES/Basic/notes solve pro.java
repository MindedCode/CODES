import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        int hRs=1;
        int gRs=2;
        int fRs=5; 
        int eRs=10;
        int dRs=20;
        int cRs=50;
        int bRs=100;
        int aRs=1000;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        
        if(n<=1000){
            System.out.println(-1);
        }
        else{
        switch(1){
            case 1: System.out.println("there is a 1 note " + n/hRs);
            case 2: System.out.println("there is a 2 note " + n/gRs);
            case 3: System.out.println("there is a 5 note " + n/fRs);
            case 4: System.out.println("there is a 10 note " + n/eRs);
            case 5: System.out.println("there is a 20 note " + n/dRs);
            case 6: System.out.println("there is a 50 note " + n/cRs);
            case 7: System.out.println("there is a 100 note " + n/bRs);
            case 8: System.out.println("there is a 1000 note " + n/aRs);
            
        }
        }
    }
}
