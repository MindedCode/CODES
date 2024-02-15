package day57;

public class Discounts {

    static double discount(int ...Prod){
        double sum = 0;
        for (int i : Prod) {
            sum+=i;
        }
        if(sum<500) return sum*0.10;
        else if(sum>=500 && sum<1000) return sum*0.15;
        else return sum *0.20;
    }
    public static void main(String[] args) {
        int max = 7<9 ? 9 : 7;
        System.out.println(max);

        System.out.println(discount(10,30,90,810,6, 9));
    }
}
