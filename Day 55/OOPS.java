import java.util.*;

public class OOPS {
    public static void main(String[] args) {

        Pen p1 = new Pen();// created a pen objectp1

        System.out.println(p1.color);

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
    nt age;

    void calcPercent(int phy, int math, int chem) {
        percentage = (phy + math + chem) / 3;

    }
}