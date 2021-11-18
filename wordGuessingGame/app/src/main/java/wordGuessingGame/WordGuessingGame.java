package wordGuessingGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class WordGuessingGame {
    StringBuilder hiddenWord;
    Integer remainingAttempts = 10 ;
    StringBuilder guessWord;
    static final ArrayList<String> DICTIONARY = new ArrayList<>(Arrays.asList("MAKERS", "CANDIES", "DEVELOPER", "LONDON"));

    WordGuessingGame(WordChooser chooser, Masker masker){
        hiddenWord = new StringBuilder(chooser.getRandomWordFromDictionary());
        masker.getMaskedWordToGuess(hiddenWord.toString());
        guessWord = masker.guessWord;
    }

    public Integer getRemainingAttempts(){
        return remainingAttempts ;
    }

    public Boolean guessLetter(Character letter){
        if (isGameLost()){
            System.out.printf("You have no lives remaining");
            return false;
        }
        if (isGameWon()){
            System.out.printf("You have already won!");
            return true;
        }
        while (hiddenWord.toString().indexOf(letter) >= 0 ){
            System.out.printf("Match!");
            replaceHiddenLetters(letter);
            return Boolean.TRUE;
        }
        remainingAttempts = remainingAttempts - 1 ;
        System.out.printf("life lost, lives remaining %d",remainingAttempts);
        return Boolean.FALSE;
    }

    public Boolean isGameLost(){
        if (getRemainingAttempts() <= 0){
            System.out.println(" Better luck next time!");
            return true;
        }
        return false;
    }

    public Boolean isGameWon(){
        if (guessWord.indexOf("_") == -1){
            System.out.println("Congratulations you won!");
            return true;
        }
        return false;
    }

    public void replaceHiddenLetters(Character letter){
        for (int i = 1; i < guessWord.length(); i++){
            if (hiddenWord.charAt(i) == letter){
                guessWord.setCharAt(i,letter);
            }

        }
        System.out.println(guessWord);
    }

}
