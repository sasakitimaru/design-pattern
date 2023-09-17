package framework;

public abstract class Factory {
    protected abstract Product createProduct(String name);
    protected abstract void registerProduct(Product product);
    public final Product create(String name) {
        Product p = createProduct(name);
        registerProduct(p);
        return p;
    }
}

