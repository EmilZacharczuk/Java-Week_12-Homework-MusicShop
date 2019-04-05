import musicShop.enums.InstrumentType;
import musicShop.instruments.Guitar;
import musicShop.instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before() {
        trumpet = new Trumpet("trumpet", "metal","gold", InstrumentType.BRASS,5,50.00, 75.00);
    }

    @Test
    public void hasDescription() {
        assertEquals("trumpet", trumpet.getDescription());
    }

    @Test
    public void hasMaterial() {
        assertEquals("metal", trumpet.getMaterial());
    }

    @Test
    public void hasColor() {
        assertEquals("gold", trumpet.getColor());
    }
    @Test
    public void hasType() {
        assertEquals(InstrumentType.BRASS, trumpet.getType());
    }
    @Test
    public void hasStrings() {
        assertEquals(5, trumpet.getNumberOfStrings());
    }
    @Test
    public void hasPriceBought() {
        assertEquals(50.00, trumpet.getPriceBought());
    }
    @Test
    public void hasPriceForSale() {
        assertEquals(75.00, trumpet.getPriceForSale());
    }
    @Test
    public void canPlay() {
        assertEquals("Play trumpet", trumpet.play());
    }
}
