package musicShop.accessories;

public abstract class Accessory {

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
}
