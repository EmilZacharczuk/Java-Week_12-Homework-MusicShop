package musicShop.accessories;

public class GuitarString extends Accessory {

    private double priceBought;
    private double priceForSale;

    public GuitarString(String description, double priceBought, double priceForSale) {
        super(description);
        this.priceBought = priceBought;
        this.priceForSale = priceForSale;
    }

    public double getPriceBought() {
        return this.priceBought;
    }

    public double getPriceForSale() {
        return this.priceForSale;
    }

}
