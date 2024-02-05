package day34.bari;
import java.util.*;

public class TypeOfWeb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter any Website");
        String web = sc.nextLine();
        

        // int i = web.indexOf('.');
        // int i = web.lastIndexOf('.');

        // String extension = web.substring(i+1, web.length());
        String extension = web.substring(web.lastIndexOf(".")+1);

        // System.out.println(web+" "+i+" "+extension);
        // System.out.println(web+" "+extension);f


        switch (extension) {
            case "com": System.out.println("This Comercial Website");
                break;
            case "net": System.out.println("This Network web");
            break;
            case "in": System.out.println("This is a Indian Web");
        
            default: System.out.println("This Invaild Type of Website");
                break;
        }sc.close();
    }
}
