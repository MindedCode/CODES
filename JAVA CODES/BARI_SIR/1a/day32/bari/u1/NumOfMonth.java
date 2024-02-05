package day32.bari.u1;
import java.util.Scanner;

public class NumOfMonth {
    static String numOfMonth(int n){
        if(n==1) return "January";
        else 
        if(n==2) return "Febuary";
        else 
        if(n==3) return "March";
        else 
        if(n==4) return "April";
        else return "No";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Scanner sc = new Scanner("Hii");

        System.out.println("Check any number of month {1-12}");
        int n = sc.nextInt();

        System.out.println("You Enter number: "+n);  
        String result = numOfMonth(n);
        
        System.out.println(result);

        
    }
}
