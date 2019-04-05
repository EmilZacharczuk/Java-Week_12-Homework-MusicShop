import musicShop.accessories.GuitarString;
import musicShop.accessories.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SheetMusicTest {
    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic("sheet music", 10.00, 20.00);
    }

    @Test
    public void hasDescription() {
        assertEquals("sheet music", sheetMusic.getDescription());
    }

    @Test
    public void hasPriceBought()
    {
        assertEquals(10.00, sheetMusic.getPriceBought());
    }
    @Test
    public void hasPriceForSale() {
        assertEquals(20.00, sheetMusic.getPriceForSale());
    }
    @Test
    public void canCalculateMarkup() {
        assertEquals(10.00, sheetMusic.calculateMarkup());
    }
}
