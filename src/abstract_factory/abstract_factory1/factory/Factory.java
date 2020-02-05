package abstract_factory.abstract_factory1.factory;

public abstract class Factory {
    public static Factory getFactory(String className) {
        Factory factory = null;

        try {
            factory = (Factory) Class.forName(className).newInstance();
        } catch (IllegalAccessException | InstantiationException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return factory;
    }

    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);
}
