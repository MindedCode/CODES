public class Main {
    public static void main(String[] args) {
        int n = 4; // Number of rows
        int count = 1;
        String pattern = "* ";

        while (count <= n) {
            System.out.println(pattern);
            pattern += "* ";
            count++;
        }
    }
}



* 
* * 
* * * 
* * * * 
