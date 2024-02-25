package day73;

public class Practice {
    public static void main(String[] args) {
        // int max = 5>6 ? 5 : 6;
        // System.out.println(max);

        String s = "https.www.himanshusingh8709";

        //demostration for operation indexOf() built-in method.
        int i1 = s.indexOf("s"); 
        System.out.println(s.substring(0, i1+1));

        int i2 = s.indexOf('.');
        // find the last 'w'
        int iw = s.indexOf('w',8);
        System.out.println(iw);
        System.out.println(s.substring(i2+1,iw+1));
        // s.su

        // int i2 = s.in
    }
    
}
