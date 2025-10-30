public class PowerFinder {
    public static int findPower(int base, int num) {
        double power = Math.log(num) / Math.log(base);
        if (power == Math.floor(power))
            return (int) power; // exact integer power
        else
            return -1; // not an exact power
    }

    public static void main(String[] args) {
        System.out.println(findPower(5, 25)); // Output: 2
        System.out.println(findPower(5, 125)); // Output: 3
        System.out.println(findPower(5, 30)); // Output: -1
    }
}
