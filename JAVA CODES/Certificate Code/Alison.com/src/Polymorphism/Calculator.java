package Polymorphism;

public class Calculator {
//    No effected
//            1. Access modifier
//            2. Return type
//            3. Parameter list -> affected

//      1 type
    public void getSum(){
        System.out.println("This is a true Overloading method");
    }
//      2 type
    public int getSum(int n1, int n2){
        return n1 + n2;
    }
//      3rd type
    public int getSum(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
//    4th type
    public float getSum(float n1, float n2){
        return n1 + n2;
    }
    public String getSum(String s){
        return s;
    }
}
