public class multipalInheritance {

    public static void main(String[] args) {

        Freelancer f1 = new Freelancer();
        f1.study();
        f1.editing();
        f1.earning();

    }

}

interface Student {

    void study();

}

interface Editor {
    void editing();
}

class Freelancer implements Student, Editor {

    public void study() {
        System.out.println("Studying...");
    }

    public void editing() {
        System.out.println("Editing skillis");
    }

    public void earning() {
        System.out.println("Earning");
    }
}
