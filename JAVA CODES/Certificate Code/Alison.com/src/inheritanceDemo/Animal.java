package inheritanceDemo;

public class Animal {
    Collar c1 = new Collar();
    public void eat(){
        System.out.println("Animal is eating");
    }

    public void collar() {
        c1.animalCollar();
    }
}
