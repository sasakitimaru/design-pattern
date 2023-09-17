package dish;

import framework.Factory;
import framework.Product;

import java.util.Objects;

public class PastaFactory extends Factory {
    @Override
    protected Product createProduct(String name){
        if(name.equals("Peperoncino")){
            Pasta pepe = new Pasta(name);
            pepe.addIngredient("chili pepper");
            pepe.addSauce("garlic");
            return pepe;
        } else if (name.equals("Carbonara")) {
            Pasta carbo = new Pasta(name);
            carbo.addIngredient("bacon");
            carbo.addSauce("egg and milk");
            return carbo;
        } else {
            Pasta plain = new Pasta("Plain");
            plain.addIngredient("null");
            plain.addSauce("null");
            return plain;
        }
    }
    @Override
    protected void registerProduct(Product product){
        System.out.println(product + " registered");
    }
}
