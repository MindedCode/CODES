package day50;
public class Method {

    static int welcome(String n){
        System.out.println("Welcome Mr: "+n);
        return 0;
    }
    int max(int x, int y) {
        return x>y ? x : y;
    }
    public static void main(String[] args) {
        Method m = new Method();

        System.out.println("max  Number: "+m.max(4,6));

        welcome("Adarsh");
    }
}
