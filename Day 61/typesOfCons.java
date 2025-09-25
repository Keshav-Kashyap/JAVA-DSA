public class typesOfCons {

    public static void main(String[] args) {
    }

}

class Student {
    int age;
    String name;

    Student() {
        System.out.println("Non Parameterzied Constructor");

    }

    Student(String name) {
        this.name = name;
    }

    Student(int age) {
        this.age = age;
    }

}
