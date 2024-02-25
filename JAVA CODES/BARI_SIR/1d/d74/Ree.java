public class Ree {
    public static void main(String[] args) {
        int max;
        // System.out.println(max = 5>6 ? 5 : 6);
        String s = "My name is Adarsh";

        // demostration of indexOf() method in java
        // .Single int   // this not perform this //never put the indexOf(int)❎
        // .Single Str
        // .Str and int
        // .char and int fromindex
        // .int and int

        int iii1;
        for(int in = 0; in < s.length(); in++){
            System.out.print(iii1 = s.indexOf(in+1));   // output is -1 bcoz we try to perform in index but hum hame if index know then why find index;
        }

        
        


        // int ii2 = s.indexOf('n');   //here exact index displayed 3
        // int ii3 = s.indexOf('i');   //here exact index displayed 8
        // int ii4 = s.indexOf('A');   //here exact index displayed 11 first character('A')

        // System.out.println(ii2);
        // System.out.println(ii3);
        // System.out.println(ii4);

        // //working to substring method
        // String first  = s.substring(0, ii2);
        // String sec, third, last;


        // System.out.println("First word displayed: "+first);
        // System.out.print("Sec word: ");
        // System.out.println(sec = s.substring(ii2, ii3));
        // System.out.print("Third word: ");
        // System.out.println(third = s.substring(ii3,ii4));
        // System.out.print("Last word: ");
        // System.out.println(last = s.substring(ii4, s.length()));


        // System.out.println("Second word displayed: "+sec);
        // System.out.println("Third displayed: "+third);
        // System.out.println("Forth word displayed: "+last);
        // int i3 = s.indexOf('M');    // Returns the index within this string of the first occurrence of the specified character. If a
        // int i4 = s.indexOf(0, s.length()-1);  //here acc to count zero('0') is charcter 
        // int i5 = s.indexOf('M', 1);   // exact 7 position is character 'M'
        // int i6 = s.indexOf('M', 0);    // here find the that character use index+1    nhi to vhi same character('a') print
        // int i7 = s.indexOf('a', 5);   // first index left here  then find where character 'a'
        // int i8 = s.indexOf('a', 4);
        
        // System.out.println(i3);
        // System.out.println(i4);
        // System.out.println(i5);
        // System.out.println("This : "+i6);
        // System.out.println(i7);
        // System.out.println(i8);
    }
}
