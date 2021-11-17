package wordGuessingGame;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class WordGuessingGameTest {
    WordChooser mockedChooser = mock(WordChooser.class);
    WordChooser normalChooser = new WordChooser();

    @Test public void testGetsWordToGuess() {
        String returnItem = "MAKERS";
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
        WordGuessingGame game = new WordGuessingGame(mockedChooser);
        assertEquals("M_____", game.getWordToGuess());
    }

    @Test public void testGetsRemainingAttempts(){
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
        WordGuessingGame game = new WordGuessingGame(mockedChooser);
        assertEquals(Integer.valueOf(10), game.getRemainingAttempts());
    }

    @Test public void testGetsRandomWordFromDictionary(){
        WordGuessingGame game = new WordGuessingGame(normalChooser);
        assertTrue(game.hiddenWord instanceof String);
    }
}
