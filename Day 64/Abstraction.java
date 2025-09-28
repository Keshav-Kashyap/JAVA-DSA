public class Abstraction {
    public static void main(String[] args) {

        Horse h1 = new Horse();
        h1.eat();
        h1.walk();

        Chicken c1 = new Chicken();
        c1.eat();
        c1.walk();
        // Animal a1 = new Animal();
        // a1.eat();
        // abstract clases ke objects nhi bnaaye ja skate okay !!
    }
}

abstract class Animal {

    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk();

}

class Horse extends Animal {
    void walk() {
        System.out.println("Horse can walk with 4 lags ");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Walk ");
    }
}