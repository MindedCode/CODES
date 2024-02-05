package day38.Nestedloops;

public class Sec {
    public static void main(String[] args) {
        for(int i=1; i<4; i++){
            System.out.print(" D ");
            for(int j=1; j<4; j++){
                System.out.print("("+i+","+j+")");
            }
            System.out.println();
        }
    }
}
