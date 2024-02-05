package day35.prep;

// import day34.bari.re.string;

public class PowerOfN {
    static void powerOfN(int n, int p){
        int i=1, b=n;
        while(i<n){
            
            System.out.println(b *= p);
            i++;
        }
        // System.out.println(System.out.print("Adarsh"));
    }
    public static void main(String[] args) {
        int base = 4;
        int power = 4;
        // System.out.println(Math.pow(base, power));

        powerOfN(base, power);
        

    }
}
