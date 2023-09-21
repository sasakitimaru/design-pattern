package strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pokemon> trainer1Pokemons = new ArrayList<>();
        trainer1Pokemons.add(Pokemon.SQUIRT);
        trainer1Pokemons.add(Pokemon.CHARIZARD);
        trainer1Pokemons.add(Pokemon.IVYSAUR);

        List<Pokemon> trainer2Pokemons = new ArrayList<>();
        trainer2Pokemons.add(Pokemon.MAGMAR);
        trainer2Pokemons.add(Pokemon.TANGLEA);
        trainer2Pokemons.add(Pokemon.SQUIRTLE);

        Strategy trainer1Strategy = new SmartStrategy(trainer2Pokemons.get(0), trainer1Pokemons);
        Strategy trainer2Strategy = new NormalStrategy(trainer1Pokemons.get(0), trainer2Pokemons);
        Trainer trainer1 = new Trainer(trainer1Strategy, trainer2Strategy);
        Trainer trainer2 = new Trainer(trainer2Strategy, trainer1Strategy);
        while (trainer1Strategy.getCurrentBattlingPokemon().getHp() > 0 || trainer2Strategy.getCurrentBattlingPokemon().getHp() > 0) {
            trainer1.battle();
            trainer2.battle();
        }
    }
}
