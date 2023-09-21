package strategy;

import java.util.List;

public abstract class StrategyImpl implements Strategy {
    protected Pokemon targetPokemon;
    protected List<Pokemon> myPokemon;
    protected Pokemon currentBattlingPokemon;

    public StrategyImpl(Pokemon targetPokemon, List<Pokemon> myPokemon, Pokemon currentBattlingPokemon) {
        this.targetPokemon = targetPokemon;
        this.myPokemon = myPokemon;
        this.currentBattlingPokemon = currentBattlingPokemon;
    }

    @Override
    public void attack() {
        System.out.println("Target Pokemon: " + targetPokemon);
        System.out.println("My Pokemon: " + currentBattlingPokemon);
        System.out.println("TARGET HP: " + targetPokemon.getHp());
        currentBattlingPokemon.processDamage(targetPokemon, shouldAttackPhysically());
        System.out.println("TARGET HP: " + targetPokemon.getHp());
    }
}
