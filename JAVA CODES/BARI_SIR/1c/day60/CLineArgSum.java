package day60;

public class CLineArgSum {
    public static void main(String[] args) {
        // int max = 5>8 ? 5 : 8;
        // System.out.println(max);
        double sum = 0;
        for (String string : args) {
            if (string.matches("[0-9\\.]+")) {
                sum = sum + Double.parseDouble(string);
            } else
                System.out.println("Not a number : " + string);
        }
        System.out.println("All command line arguments sum: "+sum);
    }
}
