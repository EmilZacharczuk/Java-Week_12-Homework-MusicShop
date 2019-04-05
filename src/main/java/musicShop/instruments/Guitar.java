package musicShop.instruments;

import musicShop.enums.InstrumentType;

public class Guitar extends Instrument {

    private int numberOfStrings;


    public Guitar(String description, String material, String color, InstrumentType type, int numberOfStrings, double priceBought, double priceForSale) {
        super(description, material,color,type, priceBought, priceForSale);
        this.numberOfStrings = numberOfStrings;

    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }
    public String play() {
        return "Play guitar";
    }
}
