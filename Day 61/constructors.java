public class constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        // System.out.println(s1.n);

    }
}

class Student {
    String name;
    int age;

    Student() {
        // this.name = name;
        System.out.println("Constructor is called");
    }

}