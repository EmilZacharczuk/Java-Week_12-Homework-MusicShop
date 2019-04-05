import musicShop.MusicShop;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MusicShopTest {

    MusicShop musicShop;

    @Before public void before() {
        musicShop = new MusicShop("Ray's Music Exchange");
    }

    @Test
    public void hasName() {
        assertEquals("Ray's Music Exchange", musicShop.getName());
    }
}
