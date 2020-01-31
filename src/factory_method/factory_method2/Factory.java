package factory_method.factory_method2;

public abstract class Factory {
    public abstract Product createProduct(String owner);
    public abstract void registerProduct(Product product);

    final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }
}
