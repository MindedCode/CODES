package day40;

// import java.math.BigDecimal;

public class Strings {
    public static void main(String[] args) {
        byte s[] = { 65, 66, 32, 67, 68, 32, 69, 70, 32, 71, 72, 32, 73, 74, 32, 75 };

        String str = new String(s);
        System.out.println(str);

        // System.out.println(str.isEmpty());

        // System.out.println(str.contains("K"));

        // boolean b = str.contains("A");
        // System.out.println(b);

        // System.out.println(str.split("\\s"));

        // char charArr[] = new char[str.length()];
        // for (var i = 0; i < charArr.length; i++) {
        //      System.out.print(str.charAt(i)+" ");
        // }

        // System.out.println();
        // String words[] = str.split("\\s");
        // for (var i : words) {
        //     System.out.print(i+" ");
        // }
        // System.out.println();
        // System.out.println(words.length);

        // System.out.println(str.replaceAll(" ", ""));


        // System.out.println(Integer.valueOf(str));
        // System.out.println(Integer.parseInt(str));

        // System.out.println(str);
        // System.out.println(str);
        
        // int intValue = 0;
        // for (short bt : s) {
        //     intValue = intValue * 100 + bt;
        // }

        // System.out.println(intValue);
        
        // System.out.println(str.startsWith("AB"));
        // System.out.println(str.endsWith("J K"));

        // System.out.println(str.indent(5));


        // System.out.println(str.indexOf('G'));

        // System.out.println(str.equalsIgnoreCase(str));
        // System.out.println(str.toLowerCase());

        // System.out.println(str.substring(9));
        // System.out.println(str.substring(12, str.length()-2));

        // str.toCharArray();
        // System.out.println(str.toCharArray());
        // for (var each : charArr) {
        //     System.out.println();
        // }

        // System.out.println(str.toString());

        // MyClass myO = new MyClass(455);
        // String  representation = myO.toString();

        // System.out.println(representation+5);

        // String  representations = myO.toCharArray();

        // System.out.println(representation+5);
        char charArr[] = new char[str.length()];

        System.out.println(charArr.length);

        for(int i = 0; i<16; i++){
            System.out.print(charArr[i]+"_ ");
        }
        // System.out.println();

        System.out.println(charArr[0]+3+" "+charArr[1]+4);
        
        for(int i = charArr.length-1; i>0; i--){
            System.out.print(str.charAt(i)+" ");
        }
    }

}


// class MyClass{
//     private int x = 0;

//     public MyClass(int value){
//         this.x = x;
//     }
// }




