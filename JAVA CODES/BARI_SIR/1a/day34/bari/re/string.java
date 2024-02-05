package day34.bari.re;

public class string {
    public static void main(String[] args) {
        String s = "Jai Shree Ganesh";
        // boolean b = s.isEmpty();
        // System.out.println(b);
        // boolean b1 = s.contains("Jai");
        // System.out.println(b1);

        // String words[] = s.split("\\s");
        // System.out.println(words.length);

        // for(int i=0; i<words.length; i++){
        //     System.out.print(words[i]+" ");
        // }

        //replace method in string only use single char
        // s = s.replace(' ','g');
        // System.out.println(s);
        // s = s.replace('g', ' ');
        // System.out.println(s);

        // // replaceAll method in string 
        // s = s.replaceAll(" ", " Adarsh ");
        // System.out.println(s);

        // s = s.replaceAll(" Adarsh ", " ");
        // System.out.println(s);

        // System.out.println("\n"+s+"\n"+s+"\n"+s);
        
        // System.out.println(s.length());

        // System.out.format("%20s\n",s);
        // System.out.println("    "+s);

        // System.out.format("%-20s\n",s);
        s = ".     "+s+"    .";
        // System.out.print(s);
        // System.out.println(s.trim());
        // System.out.println(s);

        boolean b2 = s.startsWith(".     Jai");
        System.out.println(b2);

        // b2 = s.endsWith("    .");
        // System.out.println(b2);

        // char [] c = new char[s.length()];

        // for(int i=0; i<s.length(); i++){
        //     c[i] = s.charAt(i);
        //     System.out.print(c[i]);
        // }

        // System.out.println(s.length());
        // for(int i=0; i<s.length(); i++){
        //     if(c[i]=='G') 
        //     System.out.println(i);
        // }

        // int i = s.indexOf('G');
        // System.out.println(i);

        // int i1 = s.lastIndexOf('h');
        // System.out.println(i1);



        String s1 = "Hey Ramm";
        String key = "Ramm";

        // int i2 = s1.lastIndexOf(' ');
        // System.out.println(i2);

        // String find = s1.substring(i2+1);

        // if(find.equalsIgnoreCase(key)){
        //     System.out.println("Yes, this word is present in String");
        // }

        // // int b3 = find.compareToIgnoreCase(key);
        // if(find.compareToIgnoreCase(key)== 0){
        //     System.out.println("Yes, this word is present in String");
        // }

        // System.out.println(find.compareToIgnoreCase(key));
        // s = s.substring(0, 0)


        // int i3 = Character.valueOf('m');
        // System.out.println(i3);


        // long i3 = Long.valueOf(4);
        // System.out.println(i3);

        System.out.println(s1.toCharArray());

        System.out.println(s1.getCharaterAtIndex());
    }
}
