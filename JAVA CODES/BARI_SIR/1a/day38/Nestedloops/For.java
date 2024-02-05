package day38.Nestedloops;

public class For {
    public static void main(String[] args) {

        int count = 0;
        int n=3;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    System.out.println(i+" "+j+" "+k+" ");
                }System.out.println("    ");
            }System.out.println("       ");
        }
    }
}
