public class SuperKeyword {

    public static void main(String[] args) {

        Dog d1 = new Dog();

    }

}

class Animal {
    Animal() {

        System.out.println("Animal Constructor is called");

    }
}

class Dog extends Animal {
    Dog() {
        super();
        System.out.println("Dog Constructor is called");
    }
}
