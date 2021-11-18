package wordGuessingGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class WordGuessingGame {
    String hiddenWord;
    Integer remainingAttempts = 10 ;
    static final ArrayList<String> DICTIONARY = new ArrayList<>(Arrays.asList("MAKERS", "CANDIES", "DEVELOPER", "LONDON"));

    WordGuessingGame(WordChooser chooser){
        hiddenWord = chooser.getRandomWordFromDictionary();
    }

    public Integer getRemainingAttempts(){
        return remainingAttempts ;
    }

    public Boolean guessLetter(Character letter){
        if (hiddenWord.indexOf(letter) >= 0 ){
            System.out.printf("Match!");
            return Boolean.TRUE;
        }
        else
            remainingAttempts = remainingAttempts - 1 ;
            System.out.printf("life lost, lives remaining %d",remainingAttempts);
            return Boolean.FALSE;
    }


    public String getWordToGuess(){
        Integer lengthOfWord = hiddenWord.length();
        StringBuilder guessThisWord = new StringBuilder(lengthOfWord);
        guessThisWord.append(hiddenWord.charAt(0));
        for (int i = 1; i < hiddenWord.length(); i++){
            guessThisWord.append("_");
        }
        return guessThisWord.toString();
    }
}
