package factory_method.factory_method1;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
    private List<String> owners = new ArrayList<>();

    @Override
    public Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    public void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    List<String> getOwners() {
        return owners;
    }
}
