package day32.bari.u1.re;

public class Str {
    public static void main(String[] args) {
        //isEmpty() -> boolean
        String string = "jAI Shree Ganesh! ";
        boolean b = string.isEmpty();
        // System.out.println(string+" "+b+" ");

        //s.contains(charString) -> boolean
        String s = string.toLowerCase();
        string = string.toUpperCase();

        b = s.contains("shree");
        System.out.println(string+" "+b+" "+s+"fs1");

        //1-> s.split()->
        //2-> s.split(,)

        // String c[] = new String[s.length()];
        
        String words[] = s.split("\\s");

        for(int i =0; i<words.length; i++){
            System.out.print(words[i]+" ");
        }
        System.out.println(s.split("shree")+"\n\n");
        

    }
}
