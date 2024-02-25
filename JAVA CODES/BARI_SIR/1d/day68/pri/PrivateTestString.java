package day68.pri;

public class PrivateTestString {

    public static void main(String[] args) {
        // 4=4; unexpected type-----------------
        // 4; // not a statement
        // 4+4%4;// compilation error (not a statement) => The left-hand side of an
        // assignment must be a variable

        // int max = 5 == 5 ? 1 : 2;
        // System.out.println(max);

        // constructed Str object
        Str s1 = new Str();

        System.out.println("Display string only read: "+s1.getString());

        // can't modify string in java     so no writeable property method available
    



    }
}

class Str{
    private String str = "MindedCode";

    //only getter method available in java   but here is write property method create kr skate ho.
    public String getString(){
        return str;
    }
}