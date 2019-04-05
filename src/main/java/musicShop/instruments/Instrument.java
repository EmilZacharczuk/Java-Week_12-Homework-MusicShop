package musicShop.instruments;

import musicShop.enums.InstrumentType;

public abstract class Instrument {

    private String description;
    private String material;
    private String color;
    private InstrumentType type;

    public Instrument (String description, String material,String color, InstrumentType type) {
        this.description = description;
        this.material = material;
        this.color = color;
        this.type = type;
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
}
