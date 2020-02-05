package abstract_factory.abstract_factory1;

import abstract_factory.abstract_factory1.factory.Factory;
import abstract_factory.abstract_factory1.factory.Link;
import abstract_factory.abstract_factory1.factory.Page;
import abstract_factory.abstract_factory1.factory.Tray;

public class Main {
    public static void main(String[] args) {
        Factory factory = Factory.getFactory(args[0]);

        Link asahi = factory.createLink("朝日新聞", "htt;://www.asahi.com/");

        Tray traynews = factory.createTray("新聞");
        traynews.add(asahi);

        Page page = factory.createPage("LinkPage", "author");
        page.add(traynews);
        page.output();
    }
}
