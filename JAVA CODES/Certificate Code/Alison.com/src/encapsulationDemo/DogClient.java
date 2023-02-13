package encapsulationDemo;

public class DogClient {
    public static void main(String[] args) {
        DogApp d = new DogApp();

        //set the size of dog
        d.setSize(3010);
        d.showDog();
    }
}
