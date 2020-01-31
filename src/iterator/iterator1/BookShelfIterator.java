package iterator.iterator1;

public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index = 0;

    BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Object Next() {
        Book book = bookShelf.getBookAt(index);
        index++;

        return book;
    }
}
