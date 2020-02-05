package abstract_factory.abstract_factory1.factory;

import java.util.ArrayList;

public abstract class Tray extends Item {
    protected ArrayList<Item> tray = new ArrayList<>();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}
