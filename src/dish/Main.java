package dish;

import framework.Factory;
import framework.Product;

public class Main {
    public static void main(String[] args) {
        Factory factory = new PastaFactory();
        Product pepe = factory.create("Peperoncino");
        pepe.display();
        Product carbo = factory.create("Carbonara");
        carbo.display();
        Product plain = factory.create("Plain");
        plain.display();
    }
}
