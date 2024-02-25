package d7071;

public class CylinderTest {
    public static void main(String[] args) {
        // int max = 5>8 ? 5 : 8;
        // System.out.println(max);

        Cylinder c1 = new Cylinder();

        System.out.println(c1.getLen()+" "+c1.getBre());

        //call the setter methods
        c1.setLen(-12);
        c1.setBre(-10);
        System.out.println(c1.getLen()+" "+c1.getBre());

        System.out.println();
        
    }
}
class Cylinder{
    private int len;
    private int bre;

    public Cylinder(int len, int bre){
        len = len;
        bre = bre;
    }
    public Cylinder() {
       // TODO Auto-generated constructor stub
    }
    public int getLen() {
        return len;
    }
    public int getBre() {
        return bre;
    }
    public void setLen(int len) {
        if(len>=0)
        this.len = len;
        else len = 0;
    }
    public void setBre(int bre) {
        if(bre>=0)
        this.bre = bre;
        else bre = 0;
    }

}
