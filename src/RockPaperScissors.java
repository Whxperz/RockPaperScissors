import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {

    public static void main(String[] args){
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int random_pickup;
        String again;
        System.out.println("Rules:");
        System.out.println("Each round is worth 10 points");
        System.out.println("If you win the round then you gain 10 points");
        System.out.println("If you lose the round then 10 points will be taken away");
        System.out.println();
        System.out.println();

        do {
            String[] options = {"Rock", "Paper", "Scissors"};
            Random rand_new = new Random();
            String computerChoice;
            String answer;

            //random_pickup = rand_new.nextInt(3);


            int points = 0;
            int round = 0;

            do {
                round = round + 1;
                System.out.println("It's round " + round + "!");
                System.out.println("Pick Rock, Paper, or Scissors");
                answer = keyboard.nextLine();
                random_pickup = rand_new.nextInt(3);
                computerChoice = options[random_pickup];
                System.out.println("The computer picked " + computerChoice);
                if (answer.equalsIgnoreCase(computerChoice)) {
                    System.out.println("It's a draw");
                    points = points + 0;
                    System.out.println("Points: "+ points);
                } else if (answer.equalsIgnoreCase("rock") ) {
                    if (computerChoice.equalsIgnoreCase("Scissors")) {
                        System.out.println("You win");
                        points = points + 10;
                        System.out.println("Points: " + points);
                    } else if (computerChoice.equalsIgnoreCase("Paper")) {
                            System.out.println("You lose");
                            points = points - 10;
                            System.out.println("Points: "+ points);
                    }
                }
                else if (answer.equalsIgnoreCase("Paper") ) {
                    if (computerChoice.equalsIgnoreCase("rock")) {
                        System.out.println("You win");
                        points = points + 10;
                        System.out.println("Points: " + points);
                    } else if (computerChoice.equalsIgnoreCase("Scissors")) {
                        System.out.println("You lose");
                        points = points - 10;
                        System.out.println("Points: "+ points);
                    }
                }
                else if (answer.equalsIgnoreCase("Scissors") ) {
                    if (computerChoice.equalsIgnoreCase("Paper")) {
                        System.out.println("You win");
                        points = points + 10;
                        System.out.println("Points: " + points);
                    } else if (computerChoice.equalsIgnoreCase("rock")) {
                        System.out.println("You lose");
                        points = points - 10;
                        System.out.println("Points: "+ points);
                    }
                }

            } while (round < 3);

            System.out.println("Would you like to play again? Yes/No");
            again = keyboard.nextLine();
        }while (again.equalsIgnoreCase("Yes"));

    }
}
