package iterator.iterator2;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate {
    private List<Book> books = new ArrayList<>();

    void appendBook(Book book) {
        books.add(book);
    }

    int getLength() {
        return books.size();
    }

    Book getBookAt(int index) {
        return books.get(index);
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
