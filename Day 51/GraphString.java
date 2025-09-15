import java.util.*;

public class GraphString {

    public static double displacement(String str) {
        int x = 0, y = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            switch (ch) {
                case 'W':
                    x--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'N':
                    y++;
                    break;
            }
        }

        double disp = Math.sqrt((x * x) + (y * y));
        return disp;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = "WNEENESENNN";
        System.out.println(displacement(str));

    }
}
