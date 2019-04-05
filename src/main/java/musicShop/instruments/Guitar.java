package musicShop.instruments;

import musicShop.enums.InstrumentType;

public class Guitar extends Instrument {

    private int numberOfStrings;
    private double priceBought;
    private double priceForSale;

    public Guitar(String description, String material, String color, InstrumentType type, int numberOfStrings, double priceBought, double priceForSale) {
        super(description, material,color,type);
        this.numberOfStrings = numberOfStrings;
        this.priceBought = priceBought;
        this.priceForSale = priceForSale;
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }
    public double getPriceBought() {
        return this.priceBought;
    }
    public double getPriceForSale() {
        return this.priceForSale;
    }
}
