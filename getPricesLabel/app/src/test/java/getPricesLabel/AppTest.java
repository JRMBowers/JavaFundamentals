/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package getPricesLabel;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void returnsPrice() {
        GetPricesLabel priceslabel = new GetPricesLabel();
        assertEquals(2.50, priceslabel.price("coffee"), 0);
        assertEquals("expects to return price", "The price for item coffee is 2.5", priceslabel.get_item("coffee"));
    }
}