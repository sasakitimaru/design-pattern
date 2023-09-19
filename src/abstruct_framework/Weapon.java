package abstruct_framework;

import warriorweaponfactory.Player;

public abstract class Weapon extends Equipment {
    protected int attackStatus;
    protected int defenseStatus;
    public Weapon(String name, int attackStatus, int defenseStatus, int requiredStatus) {
        super(name, requiredStatus);
        this.attackStatus = attackStatus;
        this.defenseStatus = defenseStatus;
    }
    public int getAttackStatus() {
        return this.attackStatus;
    }
    public int getDefenseStatus() {
        return this.defenseStatus;
    }
    @Override
    public void Equip(Player player) {
        player.setEquipments(this);
        player.setStatus(this.attackStatus, this.defenseStatus);
        System.out.println("~~~~~~EQUIPPED~~~~~~");
        System.out.println("WEAPON NAME: " + this.name);
        System.out.println("ATTACK: " + this.attackStatus);
        System.out.println("DEFENSE: " + this.defenseStatus);
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
    }
    @Override
    public String toString() {
        return "WEAPON NAME: " + this.name + "\nATTACK: " + this.attackStatus + "\nDEFENSE: " + this.defenseStatus;
    }
}
