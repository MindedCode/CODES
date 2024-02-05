package day38.re;

public class NumsOfwords {

    static int numsOfWords(int n){
        int digit = 0;
        while (n>0) {
            digit = n%10;
            switch (digit) {
                case 0: System.out.print("Zero "); break;
                case 1: System.out.print("One "); break;
                case 2: System.out.print("Two "); break;
                case 3: System.out.print("Three "); break;
                case 4: System.out.print("Four "); break;
                case 5: System.out.print("Five "); break;
                case 6: System.out.print("Six "); break;
                case 7: System.out.print("Seven "); break;
                case 8: System.out.print("Eight "); break;
                case 9: System.out.print("Nine "); break;
            
                default: System.out.print("Invalid digit");
            }
            n/=10;
        }
        return 0;
    }
    public static void main(String[] args) {
        int n = 1700;
        numsOfWords(n);
        
    }
}
