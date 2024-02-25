package day66;

public class TestLap {
    public static void main(String[] args) {
        // int max = 6>7 ? 6 : 7;
        // System.out.println(max);

        //created object help of new keyword
        Laptop l1 = new Laptop();

        // System.out.println(l1.setBrandName("Acer"));   output=> Null bcoz  here is not set any value and private bhi hai
        l1.setBrandName("HP");
        System.out.println("Laptop name: "+l1.getBrandName());

        // System.out.println(l1.core);    not set any value then oput is null

        l1.setBrandName("i9 cores");
        System.out.println("cores of Laptop: "+l1.getBrandName());


        TestL tl = new TestL();

        tl.toString("Apple ", "i9 pro");
        System.out.println(tl);
    }
}

class Laptop{
    private String brandName;
    private String core;
    

    public String getBrandName(){
        return brandName;
    }
    public void setBrandName(String name){
        brandName = name;
    }
    // sec value access
    public String getCore(){
        return core;
    }
    public void setCore(String c){
        core = c;
    }
}

class TestL{
    private String brandName;
    private String core;

    public String toString(){
        return "name: "+brandName+"\ncores "+core;
    }
    public void toString(String name, String c){
        brandName = name;
        core = c;
    }


}
