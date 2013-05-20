package test.java;

import main.java.Item;
import main.java.ShoppingList;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ShoppingListTest {

    @Test
    public void shouldHoldASingleItem(){
        Item item = new Item();
        ShoppingList shoppingList = new ShoppingList();
        shoppingList.add(item);
        assertThat(shoppingList.contains(), is(1));
    }

    @Test
    public void shouldHoldMultipleItems(){
        Item item = new Item();
        Item item2 = new Item();
        ShoppingList shoppingList = new ShoppingList();
        shoppingList.add(item).add(item2);
        assertThat(shoppingList.contains(), is(2));
    }
}