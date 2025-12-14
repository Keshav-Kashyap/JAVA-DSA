import java.util.ArrayList;

public class indianConis {

    public static void main(String[] args) {

        int val = 590;

        // lets array is descending sorted already
        int coins[] = { 2000, 500, 100, 50, 20, 10, 5, 2, 1 };
        ArrayList<Integer> coinsList = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {

            if (val >= coins[i]) {
                coinsList.add(coins[i]);
                val -= coins[i];
                i--;
            }

        }

        System.out.println("Total coins:" + coinsList.size());
        System.out.println("Conis are:" + coinsList);

    }

}