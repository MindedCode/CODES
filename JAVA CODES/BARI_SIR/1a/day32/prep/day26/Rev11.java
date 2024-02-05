package prep.day26;
class Rev11{
    static void findHcf1(int x, int y){
        int result = 0;
        while(x != y) result = x < y ? (y -= x) : (x -= y);
        System.out.println("HCF is: " + result);
    }
    
    static int findHcf(int x, int y){
        int hcf=0;
        int min = x<y ? x : y;
        for(int i=1; i<=min; i++){
            if(x%i==0 && y%i==0) hcf = i;
        }
        return hcf;
    }
    public static void main(String [] adarsh){
        int n1 = 36, n2 = 60;
        int r1 = findHcf(n1, n2);
        System.out.println("HCF is: "+r1);
        findHcf1(n1, n2);
    }
}