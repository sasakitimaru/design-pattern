package strategy;

public class Action {
    public void attack() {
        System.out.println("Target Pokemon: " + targetPokemon);
        System.out.println("My Pokemon: " + currentBattlingPokemon);
        System.out.println("TARGET HP: " + targetPokemon.getHp());
        currentBattlingPokemon.processDamage(targetPokemon, shouldAttackPhysically());
        System.out.println("TARGET HP: " + targetPokemon.getHp());
    }
}
