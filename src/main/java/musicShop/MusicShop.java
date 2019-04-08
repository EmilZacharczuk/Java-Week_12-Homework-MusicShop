package musicShop;

import musicShop.interfaces.ISell;

import java.util.ArrayList;

public class MusicShop {

    private String name;
    private ArrayList<ISell> sellable;

    public MusicShop(String name, ArrayList<ISell> sellable) {
        this.name = name;
        this.sellable = sellable;
    }
    public String getName() {
        return this.name;
    }

    public ArrayList<ISell> getAllSellable() {
        return sellable;
    }

    public void removeSellable() {
        this.sellable.remove(1);
    }
    public void addSellable(ISell sellable) {
        this.sellable.add(sellable);
    }
}
