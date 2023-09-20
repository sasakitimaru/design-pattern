package warriorfactory;

import abstruct_framework.Weapon;

public class Shield extends Weapon {
    public Shield(String name, int attackStatus, int defenseStatus, int requiredStatus) {
        super(name, attackStatus, defenseStatus, requiredStatus);
    }
    public void Defend() {
        System.out.println("DEFENDED WITH " + this.name);
    }
}
