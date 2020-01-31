package prototype.prototype1;

import java.util.HashMap;
import java.util.Map;

class Manager {
    private Map<String, Product> showcase = new HashMap<>();

    void register(String productName, Product product) {
        showcase.put(productName, product);
    }

    Product create(String productName) {
        Product product = showcase.get(productName);
        return product.createClone();
    }

    boolean containsProductName(String productName) {
        return this.showcase.containsKey(productName);
    }
}
