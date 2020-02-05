package abstract_factory.abstract_factory1.factory;

public abstract class Item {
    protected String caption;

    Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
