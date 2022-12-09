// import java.util.*;

class Box{
     double w,d,h;
}
class Main{
     public static void main(String args[] ) {
          Box mybox = new Box();
          double vol;
          mybox.w=10;
          mybox.d=20;
          mybox.h=1;
          vol =mybox.w*mybox.d*mybox.h;
          System.out.println("Volume is "+vol);
     
}}
