package warriorfactory;

import abstruct_framework.Equipment;
import abstruct_framework.Factory;
import abstruct_framework.FullGear;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("KURIMATSU", 100, 100, 100, 100);
        player.showStatus();
        Factory factory = Factory.getFactory("warriorfactory.WarriorFactory");
        List<Equipment> equipments = new ArrayList<>();
        equipments.add(factory.createWeapon("warriorfactory.Sword", "SWORD-X", 10, 0, 0));
        equipments.add(factory.createWeapon("warriorfactory.Shield", "SHIELD-X", 0, 10, 0));
        equipments.add(factory.createProtector("warriorfactory.Armor", "ARMOR-X", 10, 50));
        FullGear fullGear = factory.createFullGear();
        fullGear.add(equipments);
        fullGear.SetUpEquipments(player);
        player.showStatus();
    }
}
