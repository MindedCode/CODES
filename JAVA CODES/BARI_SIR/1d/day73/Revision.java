package day73;

public class Revision {
    public static void main(String[] args) {
        String s = "https.www.mindedcode8181.com";

        System.out.println(s);

        //for operation substring built in method.
        String protocal, platform, uname;

        protocal = s.substring(0,5);
        platform = s.substring(6,9);
        uname = s.substring(10,24);

        System.out.println("Protocal: " + protocal);
        System.out.println("Platform: "+platform);
        System.out.println("Username: "+uname);
        
        String domain = s.substring(25,28);
        System.out.println("Domain: "+domain);


    }

}
