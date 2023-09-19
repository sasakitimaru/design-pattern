package attackweaponfactory;

import abstruct_framework.Factory;
import abstruct_framework.FullGear;
import abstruct_framework.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("KURIMATSU", 100, 100, 100, 100);
        Factory factory = Factory.getFactory("attackweaponfactory.WeaponFactory");
        List<Weapon> weapons = new ArrayList<>();
        weapons.add(factory.createWeapon("HandHeldWeapon", "SWORD", 10, 0, 0));
        weapons.add(factory.createWeapon("BodyWornWeapon", "SHIELD", 0, 10, 0));
        FullGear fullGear = factory.createFullGear();
        fullGear.add(weapons);
        fullGear.display(player);
    }
}
