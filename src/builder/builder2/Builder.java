package builder.builder2;

public interface Builder {
    void makeTitle(String title);
    void makeString(String string);
    void makeItems(String[] items);
    void close();
}
