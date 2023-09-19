package warriorweaponfactory;

import abstruct_framework.Protector;

public class Armor extends Protector {
    public Armor(String name, int requiredStatus, int defenseStatus) {
        super(name, requiredStatus, defenseStatus);
    }
    public void ReduceDamage() {
        System.out.println("REDUCED DAMAGE WITH " + this.name);
    }
}
