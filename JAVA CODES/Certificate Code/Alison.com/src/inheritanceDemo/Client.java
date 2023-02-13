package inheritanceDemo;

public class Client {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();

        Animal a = new Animal();
        a.eat();

        BullDog b = new BullDog();
        b.eat();

        Cat c = new Cat();
        c.eat();

        Elephant e = new Elephant();
        e.eat();

        Kitty k = new Kitty();
        k.eat();

        d.sound();
        b.sound();
        c.sound();
        e.sound();
        k.sound();
        d.collar();
    }
}
