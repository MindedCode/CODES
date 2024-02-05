package day38.Nestedloops;

// pattern
//    2 3 4
//    3 4 5
//    4 5 6

public class Third{
    public static void main(String[] args) {
        int n = 4;
        for(int i=1; i<n+1; i++){
            System.out.print(" A ");
            for(int j=1; j<n+1; j++){
                System.out.print(i+j+" ");
            }System.out.println();
        }

        System.out.println("\n\n");

        int count =0;
        for(int i=1; i<n+1; i++){
            System.out.print(" D ");
            for(int j=1; j<n+1; j++){
                System.out.format("%02d ",++count);
            }System.out.println();
        }

        System.out.println("\n\n");

        for(int i=1; i<n+1; i++){
            System.out.print(" A ");
            for(int j=1; j<n-i+2; j++){
                System.out.format("%02d ",j);
            }System.out.println();
        }

        System.out.println("\n\n");

        for(int i=1; i<n+1; i++){
            for(int j=2; j<i+1; j++){
                System.out.print("a");
            }System.out.println();
            for(int j=1; j<n-i+1; j++){
                System.out.print("* ");
            }System.out.println();
        }

    }
}
