package strategy;

import java.util.List;
import java.util.Random;

public class NormalStrategy extends StrategyImpl {
    private Random random = new Random();
    public NormalStrategy(Pokemon targetPokemon, List<Pokemon> myPokemon, Pokemon currentBattlingPokemon) {
        super(targetPokemon, myPokemon, currentBattlingPokemon);
    }
    @Override
    public boolean shouldChangePokemon() {
        return random.nextInt() % 4 == 0;
    }

    @Override
    public boolean shouldAttackPhysically() {
        return random.nextInt() % 2 == 0;
    }
}
