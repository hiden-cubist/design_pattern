package abstract_factory.abstract_factory1.listfactory;

import abstract_factory.abstract_factory1.factory.Item;
import abstract_factory.abstract_factory1.factory.Page;

public class ListPage extends Page {
    ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    protected String makeHTML() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("<html><head><title>").append(title).append("</title></head>\n");
        stringBuilder.append("<body>\n");
        stringBuilder.append("<h1>").append(title).append("</h1>\n");
        stringBuilder.append("<ul>\n");

        for (Item item: content) {
            stringBuilder.append(item.makeHTML());
        }

        stringBuilder.append("</ul>\n");
        stringBuilder.append("<hr><address>").append(author).append("</address>");
        stringBuilder.append("</body></html>\n");

        return stringBuilder.toString();
    }
}
