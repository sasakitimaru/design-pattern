package dish;

import framework.Product;
public class Pasta extends Product{
    private String pastaType;
    private String ingredient;
    private String sauce;

    public Pasta(String pastaType) {
        this.pastaType = pastaType;
    }
    public void addIngredient(String ingredient) {
        System.out.println("Making ... ");
        System.out.println("Add: " + ingredient);
        this.ingredient = ingredient;
    }
    public void addSauce(String sauce) {
        System.out.println("Add: " + sauce);
        this.sauce = sauce;
    }
    @Override
    public void display() {
        System.out.println("--------Created Pasta--------");
        System.out.println("Pasta: " + pastaType);
        System.out.println("Ingredient: " + ingredient);
        System.out.println("Sauce: " + sauce);
        System.out.println("----------------------------");
    }
}
