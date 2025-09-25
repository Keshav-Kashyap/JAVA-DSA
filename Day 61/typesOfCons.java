public class typesOfCons {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student(18);
        Student s3 = new Student("keshav");
        System.out.println(s2.age);
        System.out.println(s3.name);
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
