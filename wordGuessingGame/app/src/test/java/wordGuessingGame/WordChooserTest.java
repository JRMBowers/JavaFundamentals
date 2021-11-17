package wordGuessingGame;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WordChooserTest {

    @Test
    public void testGetsRandomWordFromDictionary(){
        WordChooser word = new WordChooser();
        assertTrue(word.getRandomWordFromDictionary() instanceof String);
    }
}
