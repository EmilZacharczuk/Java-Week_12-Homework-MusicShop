package musicShop.instruments;

import musicShop.enums.InstrumentType;

public class Trumpet extends Instrument{

    private int numberOfValves;
    private double priceBought;
    private double priceForSale;

    public Trumpet(String description, String material, String color, InstrumentType type, int numberOfValves, double priceBought, double priceForSale) {
        super(description, material,color,type);
        this.numberOfValves = numberOfValves;
        this.priceBought = priceBought;
        this.priceForSale = priceForSale;
    }

    public int getNumberOfStrings() {
        return this.numberOfValves;
    }
    public double getPriceBought() {
        return this.priceBought;
    }
    public double getPriceForSale() {
        return this.priceForSale;
    }
    public String play() {
        return "Play trumpet";
    }
}
