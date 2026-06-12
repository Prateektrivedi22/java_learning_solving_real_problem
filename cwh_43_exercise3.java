import java.util.Random;
import java.util.Scanner;

class Game {
    private int randomNumber;
    private int noOfGuesses = 0;

    // Constructor
    public Game() {
        Random rand = new Random();
        randomNumber = rand.nextInt(100) + 1; // 1 to 100
    }

    public void takeUserInput() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Guess the number (1-100): ");
            int userNumber = sc.nextInt();
            noOfGuesses++;

            if (userNumber == randomNumber) {
                System.out.println("Correct! You guessed it in " + noOfGuesses + " attempts.");
                break;
            } 
            else if (userNumber > randomNumber) {
                System.out.println("Too high!");
            } 
            else {
                System.out.println("Too low!");
            }
        }
    }
}

public class cwh_43_exercise3 {
    public static void main(String[] args) {
        Game g = new Game();
        g.takeUserInput();
    }
}