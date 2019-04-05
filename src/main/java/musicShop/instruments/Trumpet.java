package musicShop.instruments;

import musicShop.enums.InstrumentType;

public class Trumpet extends Instrument{

    private int numberOfValves;


    public Trumpet(String description, String material, String color, InstrumentType type, int numberOfValves, double priceBought, double priceForSale) {
        super(description, material,color,type, priceBought, priceForSale);
        this.numberOfValves = numberOfValves;

    }

    public int getNumberOfStrings() {
        return this.numberOfValves;
    }

    public String play() {
        return "Play trumpet";
    }
}
