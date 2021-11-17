package wordGuessingGame;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShoppingListTest {
    @Test
    public void testShoppingList(){
        ShoppingList list = new ShoppingList();
        ArrayList<Object> compariter = new ArrayList<>();
        compariter.add("Coffee Machine");
        compariter.add(55.99);
        list.addItem("Coffee Machine", 55.99);
        assertEquals(list.getItems().get(0), compariter );
    }
}
