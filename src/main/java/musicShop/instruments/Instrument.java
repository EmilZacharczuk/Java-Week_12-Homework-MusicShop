package musicShop.instruments;

import musicShop.enums.InstrumentType;
import musicShop.interfaces.IPlay;
import musicShop.interfaces.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String description;
    private String material;
    private String color;
    private InstrumentType type;
    private double priceBought;
    private double priceForSale;

    public Instrument (String description, String material, String color, InstrumentType type, double priceBought, double priceForSale) {
        this.description = description;
        this.material = material;
        this.color = color;
        this.type = type;
        this.priceBought = priceBought;
        this.priceForSale = priceForSale;

    }

    public String getDescription() {
        return this.description;
    }

    public String getColor() {
        return this.color;
    }

    public InstrumentType getType() {
        return this.type;
    }

    public String getMaterial() {
        return this.material;
    }

    public double getPriceBought() {
        return this.priceBought;
    }
    public double getPriceForSale() {
        return this.priceForSale;
    }
    public double calculateMarkup() {
        double total = this.priceForSale - this.priceBought;
        return total;
    }
}
