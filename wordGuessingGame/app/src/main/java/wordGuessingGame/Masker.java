package wordGuessingGame;

public class Masker {
    StringBuilder guessWord;
    public String getMaskedWordToGuess(String hiddenWord){
        Integer lengthOfWord = hiddenWord.length();
        StringBuilder guessThisWord = new StringBuilder(lengthOfWord);
        guessThisWord.append(hiddenWord.charAt(0));
        for (int i = 1; i < hiddenWord.length(); i++){
            guessThisWord.append("_");
        }
        guessWord = guessThisWord;
        return guessThisWord.toString();
    }
}
