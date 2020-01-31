package iterator.iterator1;

public class BookShelf implements Aggregate {
    private Book[] books;
    private int last = 0;

    BookShelf(int maxsize) {
        books = new Book[maxsize];
    }

    void appendBook(Book book) {
        books[last] = book;
        last++;
    }

    int getLength() {
        return last;
    }

    Book getBookAt(int index) {
        return books[index];
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
