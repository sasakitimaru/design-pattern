package builder;

public class Director {
    private final Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public void construct(){
        builder.makeTitle("Types of Pokémon");
        builder.makeString("There are three types of Pokémon.");
        builder.makeItems(new String[]{
            "Fire type",
            "Water type",
            "Grass type"
        });
        builder.makeString("Following is the Pokémon corresponding to each type.");
        builder.makeItems(new String[]{
            "Charmander",
            "Squirtle",
            "Bulbasaur"
        });
        builder.close();
    }
}
