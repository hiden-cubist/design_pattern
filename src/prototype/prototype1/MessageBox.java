package prototype.prototype1;

public class MessageBox implements Product {
    private char decoChar;

    MessageBox(char decoChar) {
        this.decoChar = decoChar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;

        for (int i = 0; i < length + 4; i++) {
            System.out.print(decoChar);
        }
        System.out.println();
        System.out.println(decoChar + " " + s + " " + decoChar);
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decoChar);
        }
        System.out.println();
    }

    @Override
    public Product createClone() {
        try {
            return (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return null;
    }
}
