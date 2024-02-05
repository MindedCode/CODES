package day34.bari;
import java.util.*;

public class DayOfNumSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String dayName = sc.nextLine();
        // dayName.toLowerCase();
        switch (dayName) {
            case "Monday": System.out.println(1);
                break;
            case "Tuesday": System.out.println(2);
            break;
            case "Wednesday": System.out.println(3);
            break;
            default: System.out.println("You enter the Invaild day");
                break;
        }
    }
}
