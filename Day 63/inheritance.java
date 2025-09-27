public class inheritance {

    public static void main(String[] args) {

        Fish f1 = new Fish();
        // own attributes
        f1.swim();
        f1.fins = 5;
        System.out.println(f1.fins);

        // extends from base class this is aslo called single level inheritance
        f1.eat();
        f1.breadth();
        f1.color = "Blue";
        System.out.println(f1.color);

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
class Fish extends Animal {

    int fins;

    void swim() {
        System.out.println("Swiming");
    }

}