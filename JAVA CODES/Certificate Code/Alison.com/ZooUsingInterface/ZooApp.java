package ZooUsingInterface;

import java.util.Scanner;

public class ZooApp {
    public static void main(String[] args) {
        /**
         * 1. Take animal name from user
         * 2. show animal properties
         */

        ZooApp app = new ZooApp();
        Animal animal = app.getUserAnimal();
        if(animal == null){
            return;
        } else {
            System.out.println(animal.getType());
            System.out.println(animal.getSound());
            System.out.println(animal.getCageType());
            System.out.println(animal.getCollar());
        }

    }
    private Animal getUserAnimal() {
        System.out.println("|Enter animal name");
        Scanner sc = new Scanner(System.in);
        String userIp = sc.next();

        /* Validation logic */
        if (userIp.equalsIgnoreCase("monkey")) {
            return new Monkey();
        } else if (userIp.equalsIgnoreCase("Dog")) {
            return new Dog();
        } else if (userIp.equalsIgnoreCase("elephant")) {
            return new Elephant();
        } else if (userIp.equalsIgnoreCase("rabbit")) {
            return new Rabbit();
        } else if (userIp.equalsIgnoreCase("lion")) {
            return new Lion();
        } else {
            System.out.println("Animal not found , plz try again! ");
            return null;
        }
    }
}