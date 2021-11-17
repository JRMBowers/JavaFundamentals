package wordGuessingGame;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class WordGuessingGameTest {
    WordChooser mockedChooser = mock(WordChooser.class);

    @Test public void testGetsWordToGuess() {
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
        WordGuessingGame game = new WordGuessingGame(mockedChooser);
        assertEquals("M_____", game.getWordToGuess());
    }

    @Test public void testGetsRemainingAttempts(){
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
        WordGuessingGame game = new WordGuessingGame(mockedChooser);
        assertEquals(Integer.valueOf(10), game.getRemainingAttempts());
    }

    @Test public void testGuessLetterTrue(){
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
        WordGuessingGame game = new WordGuessingGame(mockedChooser);
        assertTrue(game.guessLetter('A'));
    }

    @Test public void testGuessLetterFalse(){
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
        WordGuessingGame game = new WordGuessingGame(mockedChooser);
        assertFalse(game.guessLetter('C'));
        assertEquals(game.getRemainingAttempts(), Integer.valueOf(9));
    }
}
