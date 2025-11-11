import java.util.ArrayList;

public class containerWithMostWater {

    public static void main(String[] args) {

        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        int waterContains = 0;

        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {

                int width = j - i;
                int heightOf = Math.min(height.get(i), height.get(j));
                if (waterContains < heightOf * width)
                    waterContains = heightOf * width;

            }
        }
        System.out.println(waterContains);

    }

}