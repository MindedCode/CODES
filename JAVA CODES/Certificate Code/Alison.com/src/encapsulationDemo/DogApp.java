package encapsulationDemo;

public class DogApp {
//        default size  = 110
    private int size = 110;
    // getter and setters
    // Encalsulated part
    public void setSize(int dogSize){
        if(dogSize <= 0 || dogSize > 300){
            System.out.println("invalid size");
        }
        else
        size = dogSize;
    }    /// till encapsulated part
    public int getSize(){
        return size;
    }
    public void showDog(){
        if(size == 110){
            System.out.println("The default size is " + size);
        }
        else if(size <= 100){
            System.out.println("small dog");
        }
        else if (size > 100 && size <= 300){
            System.out.println("medium dog");
        }
        else if (size > 300){
            System.out.println("larger dog");
        }
    }
}
