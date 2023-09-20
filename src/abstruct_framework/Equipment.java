package abstruct_framework;

import warriorfactory.Player;

public abstract class Equipment {
    protected String name;
    protected int requiredStatus;

    public Equipment(String name, int requiredStatus) {
        this.name = name;
        this.requiredStatus = requiredStatus;
    }

    // 条件を満たしていればEquipメソッドを実行するメソッド
    public void checkAndEquip(Player player, int requiredStatus) {
        if (isSatisfiedRequiredStatus(requiredStatus)) {
            Equip(player);
        } else {
            System.out.println("YOU CAN'T EQUIP THIS WEAPON");
            System.out.println("YOU NEED " + this.requiredStatus + " STATUS");
            System.out.println("YOUR STATUS IS " + this.requiredStatus);
        }
    }

    public abstract void Equip(Player player);

    public boolean isSatisfiedRequiredStatus(int playerStatus) {
        return playerStatus >= this.requiredStatus;
    }
}
