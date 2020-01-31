package factory_method.factory_method1;

public class IDCard extends Product {
    private String owner;

    IDCard(String owner) {
        System.out.println(owner + "のカードを作ります。");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(owner + "のカードを使います。");
    }

    String getOwner() {
        return owner;
    }
}
