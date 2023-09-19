package abstruct_framework;

import attackweaponfactory.Player;

public abstract class Equipment {
    protected String name;
    protected int attackStatus;
    protected int defenseStatus;
    protected int requiredStatus;
    public Equipment(String name, int attackStatus, int defenseStatus, int requiredStatus) {
        this.name = name;
        this.attackStatus = attackStatus;
        this.defenseStatus = defenseStatus;
        this.requiredStatus = requiredStatus;
    }
    public abstract void Equip(Player player);
    public abstract boolean isSatisfiedRequiredStatus(int playerStatus);
}
