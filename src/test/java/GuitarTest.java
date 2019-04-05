import musicShop.enums.InstrumentType;
import musicShop.instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("guitar", "wood","black", InstrumentType.GUITAR,5,50.00, 75.00);
    }

    @Test
    public void hasDescription() {
        assertEquals("guitar", guitar.getDescription());
    }

    @Test
    public void hasMaterial() {
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void hasColor() {
        assertEquals("black", guitar.getColor());
    }
    @Test
    public void hasType() {
        assertEquals(InstrumentType.GUITAR, guitar.getType());
    }
    @Test
    public void hasStrings() {
        assertEquals(5, guitar.getNumberOfStrings());
    }
    @Test
    public void hasPriceBought() {
        assertEquals(50.00, guitar.getPriceBought());
    }
    @Test
    public void hasPriceForSale() {
        assertEquals(75.00, guitar.getPriceForSale());
    }
}

