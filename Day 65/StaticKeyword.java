public class StaticKeyword {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "keshav";
        s1.schoolName = "RBS";

        System.out.println(s1.getName());
        System.out.println(s1.schoolName);

        Student s2 = new Student();

        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "CBS";

        System.out.println(s3.schoolName);
        System.out.println(s2.schoolName);

    }
}

class Student {
    String name;
    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}