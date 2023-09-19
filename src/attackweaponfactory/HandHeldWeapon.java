package attackweaponfactory;

import abstruct_framework.Weapon;

public class HandHeldWeapon extends Weapon {
    public HandHeldWeapon(String name, int attackStatus, int defenseStatus, int requiredStatus) {
        super(name, attackStatus, defenseStatus, requiredStatus);
    }

    @Override
    public void Equip(Player player) {
        if (isSatisfiedRequiredStatus(this.requiredStatus)) {
            player.setAttackAndDefenseStatus(player.getAttackStatus() + this.attackStatus, player.getDefenseStatus() + this.defenseStatus);
            System.out.println("EQUIPPED: " + this.name);
            System.out.println("====EQUIPPED====");
            System.out.println("WEAPON NAME: " + this.name);
            System.out.println("ATTACK: " + this.attackStatus);
            System.out.println("DEFENSE: " + this.defenseStatus);
        } else {
            System.out.println("YOU CAN'T EQUIP THIS WEAPON");
            System.out.println("YOU NEED " + this.requiredStatus + " STATUS");
            System.out.println("YOUR STATUS IS " + this.requiredStatus);
        }
    }

    @Override
    public boolean isSatisfiedRequiredStatus(int playerStatus) {
        return requiredStatus <= playerStatus;
    }
}
