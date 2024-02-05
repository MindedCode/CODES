package day45;

/**
 * CheckGmail
 */
public class CheckGmail {

    public static void main(String[] args) {
        System.out.println("Hii Ganesh!\n");

        String gmail = "A81@gmail.com";

        System.out.println(gmail);

        int a = gmail.indexOf('@');

        boolean b = gmail.contains("@");
        // String result = (b) ? "Yes" : "No";
        // System.out.println(result);
        System.out.println(b ? "yes" : "No");

    }
}