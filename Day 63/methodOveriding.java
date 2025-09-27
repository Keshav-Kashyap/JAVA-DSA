public class methodOveriding {

    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.eat();

        Human h1 = new Human();
        h1.eat();

    }

}

class Dog {
    void eat() {
        System.out.println("Dogs aren't eat food");
    }
}

class Human extends Dog {
    void eat() {
        System.out.println("Humans are eat food");
    }
}
