import java.util.Random;
import java.util.Scanner;

public class Task1_GuessingGame {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Random r = new Random();
            int targetNo;
            int guess;
            int score = 0;
            int total = 5;
            int min = 1;  //Lower Limit
            int max = 100;  //Upper Limit

            System.out.println("Welcome to the Number Guessing Game!");
            boolean play = true;

            while (play) {
                targetNo = r.nextInt(max - min + 1) + min;
                int attempts = 0;

                System.out.println("The game goes as follows : ");
                System.out.println("I've picked a number between " + min + " & " + max);
                System.out.println("Now its your time to guess the number I have selected!");

                while(attempts < total) {
                    System.out.print("Attempt " + (attempts + 1) + " : Enter your guess : ");
                    guess = in.nextInt();

                    if(guess == targetNo) {
                        System.out.println("Woww! Your guess is correct!");
                        score++;
                        break;
                    } else if (guess < targetNo) {
                        System.out.println("Your guess is Low!");
                    } else {
                        System.out.println("Your guess is High!");
                    }
                    attempts++;
                }

                if(attempts == total) {
                    System.out.println("Oops! You just reached the maximum number of attempts allowed. The answer is " + targetNo);
                }

                System.out.println("Do you want to continue the game? (Y / N) ");
                String playAgain = in.next().toUpperCase();

                if(!playAgain.equals("Y")) {
                    play = false;
                }
            }

            System.out.println("Tanks for playing this game!");
            System.out.println("Your score is " + score);
    }
}

