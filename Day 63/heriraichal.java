public class heriraichal {

    public static void main(String[] args) {

        Human h1 = new Human();
        // Human have owen attributes
        h1.canCode();
        // human can access animal attributes
        h1.eat();
        // human can not access dog attributes
        // h1.barking(); can't accessable

        Dog d1 = new Dog();
        // own attributes
        d1.barking();
        // animal attributes
        d1.eat();
        // can't acces human attributes

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

class Human extends Animal {

    void canCode() {
        System.out.println("They can code");
    }

}

class Dog extends Animal {
    void barking() {
        System.out.println("Dogs are barking");
    }
}