package prototype;

public interface Enemy extends Cloneable {
    public void battle_turn();
    public Enemy createCopy();
}
