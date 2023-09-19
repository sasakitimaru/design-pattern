package warriorweaponfactory;

import abstruct_framework.Weapon;

public class Sword extends Weapon {
    public Sword(String name, int attackStatus, int defenseStatus, int requiredStatus) {
        super(name, attackStatus, defenseStatus, requiredStatus);
    }
    public void Attack() {
        System.out.println("ATTACKED WITH " + this.name);
    }
}
