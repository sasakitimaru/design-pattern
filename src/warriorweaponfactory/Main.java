package warriorweaponfactory;

import abstruct_framework.Equipment;
import abstruct_framework.Factory;
import abstruct_framework.FullGear;
import abstruct_framework.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("KURIMATSU", 100, 100, 100, 100);
        player.showStatus();
        Factory factory = Factory.getFactory("warriorweaponfactory.WarriorFactory");
        List<Equipment> equipments = new ArrayList<>();
        equipments.add(factory.createWeapon("warriorweaponfactory.Sword", "SWORD-X", 10, 0, 0));
        equipments.add(factory.createWeapon("warriorweaponfactory.Shield", "SHIELD-X", 0, 10, 0));
        equipments.add(factory.createProtector("warriorweaponfactory.Armor", "ARMOR-X", 10, 50));
        FullGear fullGear = factory.createFullGear();
        fullGear.add(equipments);
        fullGear.SetUpEquipments(player);
        player.showStatus();
    }
}
