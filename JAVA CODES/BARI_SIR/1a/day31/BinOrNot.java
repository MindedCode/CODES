package day32.bari.day31;

public class BinOrNot {
    /**
     * @param args
     * ADARSH KUMAR
     * find number is binary or not simple method n use string 
     * find number is hexadecimal or not and regular exprssion(regex)
     * find the date or not
     * rm special chars
     * rm extra spaces  string
     * find num of wors in a string 
     */
    // static boolean binOrNot(String s) {

    //     boolean bl = s.contains("0");
    //     boolean bl0 = s.contains("1");
    //     if(bl0!=bl){
    //         return false;
    //     }else return true;
    //     // return true;
    // }

    static boolean isBin(int n){
        while(n>=0){
            if(n%10 != 0 && n%10 != 1) return false;
            n/=10;
        }return true;
    }

    // static boolean isBin(int n){
    //     String numStr = String.valueOf(n);
        
    //     for(int i=0; i<numStr.length(); i++){
    //         if(numStr.charAt(i)!='0' && numStr.charAt(i)!='1')
    //         return false;
    //     }
    //     return true;
    // }

    //using regular Expressions
    // static boolean isBin(int n){
    //     String s = String.valueOf(n);
    //     return s.matches("[01]+");

    // }
    

    public static void main(String[] args) {
        int a = 101;

        if(isBin(a)){
            System.out.println("Number is Binary");
        } else System.err.println("Not");
        // isBin(a);

        // // hexa decimal or not
        // String str = "DAF";
        // boolean isHex = str.matches("[0-9,A-F]+");

        // if(isHex){
        //     System.out.println("String is Binary");
        // } else System.err.println("Not");

        // String str = "    a Ab1!    %$0   4gz   ";

        // // str = str.replaceAll("[^a-zA-Z0-9]", "");
        // System.out.println(str);
        // // System.out.println(str.replaceAll("\\s+", " ").trim());
        // // System.out.println(str.replace("\\s+", " "));
        // // System.out.println(str.trim());

        // str = str.replaceAll("\\s+", " ").trim();
        // String words[] = str.split("\\s");
        // System.out.println(words.length);

        

    }
}
