public class multiInheritance {

    public static void main(String[] args) {

        Dog d1 = new Dog();
        // dogs can use all class properties

        // own attribute
        d1.barking();
        // mamals class attribute
        d1.giveBirth();
        // animal class attributes
        d1.eat();

        // Hence this is called multi inheritance
    }
}

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("Eating");
    }

    void breadth() {
        System.err.println("Breathing");
    }

}

// Derived Class
class Mamals extends Animal {

    void giveBirth() {
        System.out.println("They can give birth ");
    }

}

class Dog extends Mamals {
    void barking() {
        System.out.println("Dogs are barking");
    }
}