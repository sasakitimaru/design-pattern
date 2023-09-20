package abstruct_framework;

import warriorfactory.Player;

public abstract class Protector extends Equipment {
    private final int defenseStatus;
    public Protector(String name, int requiredStatus, int defenseStatus) {
        super(name, requiredStatus);
        this.defenseStatus = defenseStatus;
    }
    @Override
    public void Equip(Player player) {
        player.setEquipments(this);
        player.setStatus(null,this.defenseStatus);
        System.out.println("~~~~~~EQUIPPED~~~~~~");
        System.out.println("ARMOR NAME: " + this.name);
        System.out.println("DEFENSE: " + this.defenseStatus);
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
    }
    @Override
    public String toString() {
        return "ARMOR NAME: " + this.name + "\nDEFENSE: " + this.defenseStatus;
    }
}
