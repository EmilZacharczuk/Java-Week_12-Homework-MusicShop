import musicShop.accessories.GuitarString;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GuitarStringTest {

    GuitarString guitarString;

    @Before
    public void before() {
        guitarString = new GuitarString("guitar string", 10.00, 20.00);
    }

    @Test
    public void hasDescription() {
        assertEquals("guitar string", guitarString.getDescription());
    }

    @Test
    public void hasPriceBought() {
        assertEquals(10.00, guitarString.getPriceBought());
    }
    @Test
    public void hasPriceForSale() {
        assertEquals(20.00, guitarString.getPriceForSale());
    }
}


