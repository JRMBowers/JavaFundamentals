package wordGuessingGame;

import java.util.ArrayList;

public class ShoppingList {
    ArrayList<Object> shoppingList = new ArrayList<>();

    public void addItem(String item, double price){
        ArrayList<Object> itemAndPrice = new ArrayList<>();
        itemAndPrice.add(item);
        itemAndPrice.add(price);
        shoppingList.add(itemAndPrice);
    }

    public ArrayList<Object> getItems(){
        return shoppingList;
    }
}
