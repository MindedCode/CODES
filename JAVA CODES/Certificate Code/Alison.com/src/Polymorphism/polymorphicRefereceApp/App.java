package Polymorphism.polymorphicRefereceApp;

public class App {


    public static void main(String[] args) {

        // polymorphic reference
        Animal [] aniArr = new Animal[2];
        aniArr[0] = new Dog();
        aniArr[1] = new Seru();

        for(int i=0; i<aniArr.length; i++){
            aniArr [i].sound();
        }

//        Animal a = new Animal();
//        a.sound();
//
//        // polymorphic reference
//        Animal d = new Dog();
//        d.sound();
//
//        Animal d1 = new Seru();
//        d1.sound();
    }
}
