package musicShop.instruments;

import musicShop.enums.InstrumentType;
import musicShop.enums.PianoType;

public class Piano extends Instrument {

    private PianoType pianoType;

    public Piano (String description, String material,String color, InstrumentType type, PianoType pianoType) {
        super(description, material, color, type);
        this.pianoType = pianoType;
    }

    public PianoType getPianoType() {
        return this.pianoType;
    }
}
