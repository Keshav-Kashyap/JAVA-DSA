public class Getter {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setter(18);
        s1.setter("keshav");
        s1.setter(81.02);

        System.out.println(s1.age);
        System.out.println(s1.name);
        System.out.println(s1.cgpa);

    }
}

class Student {
    int age;
    String name;
    double cgpa;

    void setter(int Age) {
        age = Age;
    }

    void setter(String newName) {
        name = newName;
    }

    void setter(double newCgpa) {
        cgpa = newCgpa;
    }

}