package strategy;

import java.util.List;

public class Trainer {
    private Strategy strategy;
    private Pokemon targetPokemon;
    private List<Pokemon> myPokemon;
    private Pokemon currentBattlingPokemon;

    public Trainer(Strategy strategy, Pokemon targetPokemon, List<Pokemon> myPokemon, Pokemon currentBattlingPokemon) {
        this.strategy = strategy;
        this.targetPokemon = targetPokemon;
        this.myPokemon = myPokemon;
        this.currentBattlingPokemon = currentBattlingPokemon;
    }

    public void turn() {
        turnStart();
        battle();
        turnEnd();
    }

    public void turnStart() {
        System.out.println("------Turn start------");
    }

    public void battle() {
        System.out.println("Trainer tactics: " + strategy.getClass().getSimpleName());
        if (strategy.shouldChangePokemon()) {
            // Change pokemon
        } else {
            currentBattlingPokemon.processDamage(targetPokemon,strategy.shouldAttackPhysically());
        }
    }

    public void turnEnd() {
        System.out.println("-----Turn end-----");
    }
}
