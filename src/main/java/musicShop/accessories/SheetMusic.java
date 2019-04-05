package musicShop.accessories;

public class SheetMusic extends Accessory{

    private double priceBought;
    private double priceForSale;

    public SheetMusic(String description, double priceBought, double priceForSale) {
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
