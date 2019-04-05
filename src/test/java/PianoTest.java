import musicShop.enums.InstrumentType;
import musicShop.enums.PianoType;
import musicShop.instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("piano", "wood", "black", InstrumentType.KEYBOARD, PianoType.GRAND);
    }
    @Test
    public void hasDescription() {
        assertEquals("piano", piano.getDescription());
    }

    @Test
    public void hasMaterial() {
        assertEquals("wood", piano.getMaterial());
    }

    @Test
    public void hasColor() {
        assertEquals("black", piano.getColor());
    }
    @Test
    public void hasType() {
        assertEquals(InstrumentType.KEYBOARD, piano.getType());
    }
    @Test
    public void hasPianoType() {
        assertEquals(PianoType.GRAND, piano.getPianoType());
    }
    @Test
    public void canPlay() {
        assertEquals("Play piano", piano.play());
    }
}
