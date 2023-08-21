public class Main {
    public static void main(String[] args) {
        int n = 4; // Number of rows
        int count = 1;

        for (int i = 1; i <= n * (n + 1) / 2; i++) {
            System.out.print("* ");
            
            if (i == count * (count + 1) / 2) {
                System.out.println();
                count++;
            }
        }
    }
}


* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 
* * * * * * * 
* * * * * * * * 
