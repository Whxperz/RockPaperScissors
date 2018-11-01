import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {

    public static void main(String[] args){
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int random_pickup;
         String[] options = {"Rock", "Paper", "Scissors"};
        Random rand_new = new Random();
        String computerChoice;
        String answer;



        random_pickup = rand_new.nextInt(3);


        int points  = 1;
        int round = 0;

        do {

            System.out.println("Pick Rock, Paper, or Scissors");
            answer = keyboard.nextLine();
            random_pickup = rand_new.nextInt(3);
            computerChoice = options[random_pickup];
            System.out.println(computerChoice);
             round = round +1;
if(answer.equalsIgnoreCase(computerChoice)){
    System.out.println();
}
else if(answer.equalsIgnoreCase("rock")){
    if()
}





        }while(round < 3);

   }
}