package Lecs.d75;
public class Re{
    public static void main(String[] args) {
        int max;
        // System.out.println(max = 5>4 ? 5 : 4);
        String s = "https.www.mindedcode.com";

        int indexP = s.indexOf('.',0);
        // System.out.println(indexP);
        
        String proto, rsrc, uname, domain;
        System.out.println(proto = s.substring(0, indexP));

        int indexR = s.indexOf('.', indexP+1);
        // System.out.println(indexR);
        System.out.println((rsrc = s.substring(indexP+1, indexR)));

        int indexU = s.indexOf(".", indexR+1);
        // System.out.println(indexU);
        System.out.println(uname = s.substring(indexR+1, indexU));

        System.out.println(domain = s.substring(indexU+1, s.length()));

        System.out.println(proto+" "+rsrc+" "+uname+" "+domain);

    }
}