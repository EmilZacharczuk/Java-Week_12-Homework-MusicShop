package musicShop;

import musicShop.interfaces.ISell;

import java.util.ArrayList;

public class MusicShop {

    private String name;
    private ArrayList<ISell> sellable;

    public MusicShop(String name) {
        this.name = name;
        this.sellable = new ArrayList<>();
    }
    public String getName() {
        return this.name;
    }
}
