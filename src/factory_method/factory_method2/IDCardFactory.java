package factory_method.factory_method2;

import java.util.HashMap;
import java.util.Map;

public class IDCardFactory extends Factory {
    private Map<String, Integer> owners = new HashMap<>();
    private int serial = 0;

    @Override
    public Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    @Override
    public void registerProduct(Product product) {
        IDCard idCard = (IDCard) product;
        owners.put(idCard.getOwner(), idCard.getSerial());
    }

    Map<String, Integer> getOwners() {
        return owners;
    }
}
