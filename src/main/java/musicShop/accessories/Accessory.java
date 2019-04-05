package musicShop.accessories;

import musicShop.interfaces.ISell;

public abstract class Accessory implements ISell {

    private String description;
    private double priceBought;
    private double priceForSale;

    public Accessory(String description, double priceBought, double priceForSale) {
        this.description = description;
        this.priceBought = priceBought;
        this.priceForSale = priceForSale;
    }

    public String getDescription() {
        return this.description;
    }
    public double getPriceBought() {
        return this.priceBought;
    }
    public double getPriceForSale() {
        return this.priceForSale;
    }
    public double calculateMarkup() {
        double total =  this.priceForSale - this.priceBought;
        return total;
    }
}
