package Polymorphism;

public class App {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.getSum();
        System.out.println("2 integer parameter : " + c.getSum(1,2));
        System.out.println("3 integer  parameter : " + c.getSum(1,3,4));
        System.out.println("2 float parameter : " + c.getSum(2.3f, 2.5f));
        System.out.println("string parameter : " + c.getSum("Hi Ganesha"));

    }
}
