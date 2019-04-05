import musicShop.accessories.DrumStick;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DrumStickTest {

    DrumStick drumStick;

    @Before public void before() {
        drumStick = new DrumStick("drum stick");
    }

    @Test
    public void hasDescription() {
        assertEquals("drum stick", drumStick.getDescription());
    }
}
