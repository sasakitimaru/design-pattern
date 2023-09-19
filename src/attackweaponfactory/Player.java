package attackweaponfactory;

public class Player {
    private String name;
    private int attackStatus;
    private int defenseStatus;
    private int strengthStatus;
    private int weightStatus;
    public Player(String name, int attackStatus, int defenseStatus, int strengthStatus, int weightStatus) {
        this.name = name;
        this.attackStatus = attackStatus;
        this.defenseStatus = defenseStatus;
        this.strengthStatus = strengthStatus;
        this.weightStatus = weightStatus;
    }
    public void setAttackAndDefenseStatus(int attackStatus, int defenseStatus) {
        this.attackStatus = attackStatus;
        this.defenseStatus = defenseStatus;
    }
    public int getAttackStatus() {
        return this.attackStatus;
    }
    public int getDefenseStatus() {
        return this.defenseStatus;
    }
    public void showStatus() {
        System.out.println("Player: " + name);
        System.out.println("Attack: " + attackStatus);
        System.out.println("Defense: " + defenseStatus);
    }
}
