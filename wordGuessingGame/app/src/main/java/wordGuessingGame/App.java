/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package wordGuessingGame;

import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        WordChooser chooser = new WordChooser();
        WordGuessingGame game = new WordGuessingGame(chooser);
        System.out.println(game.getWordToGuess());
        while (game.getRemainingAttempts() > 0){
            System.out.println(" Enter your guess:");
            Scanner userInput = new Scanner(System.in);
            Character guessAttempt = userInput.next().charAt(0);
            game.guessLetter(guessAttempt);
        }
    }
}
