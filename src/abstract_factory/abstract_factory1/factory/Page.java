package abstract_factory.abstract_factory1.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public abstract class Page {
    protected String title;
    protected String author;
    protected ArrayList<Item> content = new ArrayList<>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output() {
        try {
            String filename = "./src/abstract_factory/abstract_factory1/" + title + ".html";
            Writer writer = new FileWriter(filename);
            writer.write(makeHTML());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected abstract String makeHTML();
}
