package musicShop.accessories;

public abstract class Accessory {

    private String description;

    public Accessory(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
