package strategy;

import java.util.List;

public class SmartStrategy extends StrategyImpl {
    public SmartStrategy(Pokemon targetPokemon, List<Pokemon> myPokemon, Pokemon currentBattlingPokemon) {
        super(targetPokemon, myPokemon, currentBattlingPokemon);
    }
    @Override
    public boolean shouldChangePokemon() {
        return currentBattlingPokemon.isWeak(targetPokemon);
    }

    @Override
    public boolean shouldAttackPhysically() {
        return currentBattlingPokemon.isGreaterDef(targetPokemon);
    }
}
