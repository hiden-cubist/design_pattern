package abstract_factory.abstract_factory1.listfactory;

import abstract_factory.abstract_factory1.factory.Item;
import abstract_factory.abstract_factory1.factory.Tray;

public class ListTray extends Tray {
    ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("<li>\n");
        stringBuilder.append(caption).append("\n");
        stringBuilder.append("<ul>\n");

        for (Item item: tray) {
            stringBuilder.append(item.makeHTML());
        }

        stringBuilder.append("</ul>\n");
        stringBuilder.append("</li>\n");

        return stringBuilder.toString();
    }
}
