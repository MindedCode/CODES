public class ReverseStr {
    public static String reverse(String str){
        char arr [] = str.toCharArray();
        String rev = "";
        for(int i = arr.length-1; i>=0; i--){
            rev+=arr[i];
        }
        return rev;
    }
    public static void main(String[] args) {
        String str = "This is Minded Code ";
        String result = reverse(str);
        System.out.println(result);
    }
}


// Output of the program:
edoC dedniM si sihT
