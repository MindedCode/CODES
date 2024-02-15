package day59;

public class commandLineArgu {
    public static void main(String[] args) {
        // int max = 2 > 4 ? 2 : 4;
        // System.out.println(max);
        // max = 4 > 5 ? 4 : 5;
        // System.out.println(max);
        // max = 4 < 5 ? 5 : 4;
        // System.out.println(max);System.out.println();

        double s = 0;
        for (String string : args) {
            System.out.println(string);
            if (string.matches("[0-9\\.]+")) {
                s = s + Double.parseDouble(string);
                System.out.println("Double :"+ s);
            } else {
                System.out.println("Not a Numbebr :"+string);
            }

            
        }
        System.out.println("Sum of : " + s);
        
    }
}
