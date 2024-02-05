package day48;

class MethodPrac{

    int maxN(int x, int y){
        return x>y ? x : y;
    }
    public static void main(String[] args) {

        System.out.println("Hii People");

        MethodPrac mp = new MethodPrac();

        int a = mp.maxN(2,3);
        System.out.println(a);

        
    }
}