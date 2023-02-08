import java.util.Scanner;
public class SimpleArray {

    public static void main(String[] args) {

//        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("First add some characters...");
            char arr [] = new char[10];
            for(int i:arr){
                arr[i] = (sc.next()).charAt(i);
            }

            System.out.println("Elements = ");
            for (int i : arr)
                System.out.println(arr[i]);
//        }

    }
}


// Output is :
First add some characters...
adatshgjsf
sjkfh
g
g
g
g
g
g
gg
g
Elements = 
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 103 out of bounds for length 10
	at SimpleArray.main(SimpleArray.java:16)
g
