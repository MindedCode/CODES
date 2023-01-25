
import java.util.*;

public class Main
{
    public static void deciToBinary (int n) {
        if(n==0){
            return;
        }

        int digit = n%16;
        deciToBinary(n/16);
        if(digit <= 9) {
            System.out.print(digit + " ");
        }
        else
        change(digit);

    }
    public static void change(int n)
    {
        switch(n){
            case 10: System.out.print("A" + " ");break;
            case 11: System.out.print("B" + " "); break;
            case 12: System.out.print("C" + " "); break;
            case 13: System.out.print("D" + " "); break;
            case 14: System.out.print("E" + " "); break;
            case 15: System.out.print("F" + " "); break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        deciToBinary(n);

    }
}


OutPut of the Program:

12000
2 E E 0 
