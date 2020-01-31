package template_method.template_method1;

public class StringDisplay extends AbstractDisplay {
    private String string;

    StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public void open() {
        printHorizontalLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printHorizontalLine();
    }

    private void printHorizontalLine() {
        int length = this.string.length();

        System.out.print("+");
        for (int i = 0; i < length; i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
}
