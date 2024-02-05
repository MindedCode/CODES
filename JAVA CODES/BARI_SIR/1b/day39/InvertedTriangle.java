package day39;

public class InvertedTriangle {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 2; j < i + 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < n - i + 2; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("");

        // second method
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (j >= i) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i < n + 1; i++) {
            for (int j = 2; j < n - i + 2; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        //right folded triangle
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (i+j>n) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }


        // triangle
        System.out.println("Triangle: ");
        for(int i=1; i<n+1; i++){
            for(int j=2; j<n-i+2; j++){
                System.out.print("  ");
            }
            for(int j=1; j < 2*i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Triangle: ");
        for(int i=1; i<n+1; i++){
            for(int j=2; j<n-i+2; j++){
                System.out.print("  ");
            }
            for(int j=1; j < 2*i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=n; i>1; i--){
            for(int j=1; j<n-i+2; j++){
                System.out.print("  ");
            }
            for(int j=1; j < 2*i-2; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
