import musicShop.MusicShop;
import musicShop.accessories.DrumStick;
import musicShop.enums.InstrumentType;
import musicShop.instruments.Guitar;
import musicShop.interfaces.ISell;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class MusicShopTest {

    MusicShop musicShop;
    DrumStick drumStick;

    @Before public void before() {
        ArrayList<ISell> sellable = new ArrayList<>();
        musicShop = new MusicShop("Ray's Music Exchange", sellable);
        drumStick = new DrumStick("drum stick", 20.00, 30.00);
        sellable.add(drumStick);


    }

    @Test
    public void hasName() {
        assertEquals("Ray's Music Exchange", musicShop.getName());
    }


    @Test
    public void hasStock() {
        assertEquals(1, musicShop.getAllSellable().size());
    }

    @Test
    public void canRemoveStock() {
        Guitar guitar = new Guitar("guitar", "wood","brown", InstrumentType.STRINGS, 6, 20.00,30.00 );
        musicShop.addSellable(guitar);
        musicShop.removeSellable();
        assertEquals(1, musicShop.getAllSellable().size());
    }

    @Test
    public void canAddStock() {
        Guitar guitar = new Guitar("guitar", "wood","brown", InstrumentType.STRINGS, 6, 20.00,30.00 );
        musicShop.addSellable(guitar);
        assertEquals(2, musicShop.getAllSellable().size());
    }
}
