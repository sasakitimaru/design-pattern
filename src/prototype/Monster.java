package prototype;

public class Monster implements Enemy {
    private final String name;
    private int hp;
    private boolean isClone = false;
    public Monster(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    public Monster(Monster monster) {
        this.name = monster.name;
        this.hp = monster.hp;
        this.isClone = true;
    }
    @Override
    public void battle_turn() {
        String MonsterTypeLabel = isClone ? "Monster(Clone): " : "Monster: ";
        System.out.println("----start battle----");
        System.out.println(MonsterTypeLabel + name + " HP: " + hp);
        hp -= 10;
        System.out.println("get damage");
        System.out.println(MonsterTypeLabel + name + " HP: " + hp);
        System.out.println("-----end battle-----");
    }
    @Override
    public Enemy createCopy() {
//        Enemy enemy = null;
//        try {
//            enemy = (Enemy)clone();
//            ((Monster)enemy).isClone = true;
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
        System.out.println("===Monster created===");
        System.out.println("Monster(Clone): " + name + " HP: " + hp);
//        return enemy;
        return new Monster(this);
    }
}
