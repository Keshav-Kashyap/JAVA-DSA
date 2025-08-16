import java.util.Scanner;

public class withSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Choice B/w them\n1.Rock\n2.Paper\n3.Scissors");

        // System.out.println("Your Random Value = " + value);
        int start = 1;

        while (start == 1) {

            System.out.println("Enter Your Chioce :");
            int userChoice = sc.nextInt();
            double value = Math.random();// 0.0 -> 1.0(included)
            double rand = (value * 3) + 1;
            int compChoice = (int) rand;

            switch (userChoice) {
                case 1:
                    System.out.println("Your Choice Is Rock");
                    break;
                case 2:
                    System.out.println("Your Choice Is Paper");
                    break;
                case 3:
                    System.out.println("Your Choice Is Scissors");
                    break;
                default:
                    System.out.println("Invaild Choice!!");

            }
            switch (compChoice) {
                case 1:
                    System.out.println("Computer Choice Is Rock");
                    break;
                case 2:
                    System.out.println("Computer Choice Is Paper");
                    break;
                case 3:
                    System.out.println("Computer Choice Is Scissors");
                    break;
                default:
                    System.out.println("Invaild Choice!!");

            }

            // Cheak Who is Win
            // Rock + Paper => Paper
            // Rock+Scissors=> Rock
            // Paper +Scissors => Scissors

            if ((userChoice == 1 && compChoice == 2) || (userChoice == 2 && compChoice == 3)) {
                System.out.println("Computer Won");
            } else if (userChoice == 2 && compChoice == 1) {
                System.out.println("You Won");
            } else if (userChoice == 3 && compChoice == 1) {
                System.out.println("Computer Won");

            } else if (userChoice == 3 && compChoice == 2) {
                System.out.println("You Won");

            } else if (userChoice == 1 && compChoice == 3) {
                System.out.println("You Won");
            } else {
                System.out.println("Draw");
            }

            System.out.println("Play Again? Press 1\nEnd Game Press 0");
            start = sc.nextInt();
            if (start != 1) {
                System.out.println("Thanks For Playing, The Game has Ended");
            }

        }
    }

}
