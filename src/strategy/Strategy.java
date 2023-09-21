package strategy;

public interface Strategy {
    public void attack();
    public boolean shouldAttackPhysically();
    public boolean shouldChangePokemon();
}
