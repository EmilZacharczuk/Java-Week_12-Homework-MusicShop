import musicShop.accessories.DrumStick;
import musicShop.accessories.GuitarString;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DrumStickTest {

    DrumStick drumStick;
    @Before
    public void before() {

        drumStick = new DrumStick("drum stick", 10.00, 20.00);
    }

    @Test
    public void hasDescription() {
        assertEquals("drum stick", drumStick.getDescription());
    }

    @Test
    public void hasPriceBought() {
        assertEquals(10.00, drumStick.getPriceBought());
    }
    @Test
    public void hasPriceForSale() {
        assertEquals(20.00, drumStick.getPriceForSale());
    }
}
