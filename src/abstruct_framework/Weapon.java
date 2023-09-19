package abstruct_framework;

public abstract class Weapon extends Equipment {
    public Weapon(String name, int attackStatus, int defenseStatus, int requiredStatus) {
        super(name, attackStatus, defenseStatus, requiredStatus);
    }
}
