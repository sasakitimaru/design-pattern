package prototype;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Enemy slime = new Monster("slime", 100);
        Enemy dragon = new Monster("dragon", 1000);
        manager.register("slime", slime);
        manager.register("dragon", dragon);
        slime.battle_turn();
        dragon.battle_turn();
        Enemy slime1 = manager.create("slime");
        slime1.battle_turn();
        slime.battle_turn();
    }
}
