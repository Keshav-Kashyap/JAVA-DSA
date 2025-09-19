import java.util.*;

public class NewOops {
    public static void main(String[] args) {

        Pen p1 = new Pen();// created a pen objectp1
        p1.setColor("Blue");

        System.out.println(p1.color);

        p1.setTip(4);
        System.out.println(p1.tip);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Keshav";
        System.out.println(myAcc.username);
        myAcc.setPassword("password");
        myAcc.getPassword();

    }
}

class BankAccount {

    public String username;
    private String password;

    void setPassword(String pass) {
        password = pass;
    }

    void getPassword() {
        System.out.println(password);
    }

}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    int age;
    String name;
    float percentage;

    void calcPercent(int phy, int math, int chem) {
        percentage = (phy + math + chem) / 3;

    }
}