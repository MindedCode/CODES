package day68.pri;

public class PrivateCheckStr {

    public static void main(String[] args) {

        // constructed Str object
        Str s1 = new Str();

        System.out.println("Display string read only: "+s1.getString());

        // can't modify string in java     so no writeable property method available
    
    }
}
class Str{
    private String str = "MindedCode";

    //only getter method available in java   but here is write(setter) property method create kr skate ho.
    public String getString(){
        return str;
    }
}