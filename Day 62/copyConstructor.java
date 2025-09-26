public class copyConstructor {
    public static void main(String[] args) {

        Student s1 = new Student("keshav", "keshav123", 23);
        // Student s2 = new Student(s1);
        // s1.name = "nonono";// change
        // System.out.println(s2.name);// no changes becouse this is not refernce copy
        // this is deep copy
        // System.out.println(s1.name);
        // // but arrays are refernce copy like you can see

        s1.marks[0] = 20;
        s1.marks[1] = 10;
        s1.marks[2] = 15;

        Student s2 = new Student(s1);
        s1.marks[1] = 100;

        // s1 ke liye
        for (int i = 0; i < 3; i++) {
            System.out.println(s1.marks[i]);

        }

        // s2 ke liye
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);

        }

    }

}

class Student {
    int age;
    String name;
    String password;
    int marks[];

    // shallow Copy Constructor
    // Student(Student std) {
    // marks = new int[3];
    // this.name = std.name;
    // this.age = std.age;
    // this.password = std.password;
    // this.marks = std.marks;
    // }

    // deep copy constructor
    Student(Student std) {
        marks = new int[3];
        this.name = std.name;
        this.age = std.age;
        this.password = std.password;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = std.marks[i];
        }
    }

    // Parameterized Constructor
    Student(String name, String password, int age) {
        marks = new int[3];
        this.name = name;
        this.password = password;
        this.age = age;

    }

}