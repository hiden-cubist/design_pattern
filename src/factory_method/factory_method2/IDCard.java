package factory_method.factory_method2;

public class IDCard extends Product {
    private String owner;
    private int serial;

    IDCard(String owner, int serial) {
        System.out.println(owner + "(" + serial + ")" + "のカードを作ります。");
        this.owner = owner;
        this.serial = serial;
    }

    @Override
    public void use() {
        System.out.println(owner  + "(" + serial + ")" + "のカードを使います。");
    }

    String getOwner() {
        return owner;
    }

    int getSerial() {
        return serial;
    }
}
