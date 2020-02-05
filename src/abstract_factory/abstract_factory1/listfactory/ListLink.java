package abstract_factory.abstract_factory1.listfactory;

import abstract_factory.abstract_factory1.factory.Link;

public class ListLink extends Link {
    ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
