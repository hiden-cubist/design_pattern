package prototype.prototype1;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        MessageBox messageBox = new MessageBox('*');
        UnderlinePen underlinePen = new UnderlinePen('~');

        manager.register("warning box", messageBox);
        manager.register("strong message", underlinePen);

        String[] productNames = {"warning box", "strong message"};
        for (String productName: productNames) {
            if (manager.containsProductName(productName)) {
                Product product = manager.create(productName);
                product.use("Hello, world.");
            }
        }
    }
}
