package musicShop.instruments;

import musicShop.enums.InstrumentType;
import musicShop.enums.PianoType;

public class Piano extends Instrument {

    private PianoType pianoType;

    public Piano (String description, String material,String color, InstrumentType type, PianoType pianoType, double priceBought, double priceForSale) {
        super(description, material, color, type, priceBought, priceForSale);
        this.pianoType = pianoType;
    }

    public PianoType getPianoType() {
        return this.pianoType;
    }
    public String play() {
        return "Play piano";
    }
}
