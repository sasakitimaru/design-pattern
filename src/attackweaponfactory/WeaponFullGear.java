package attackweaponfactory;

import abstruct_framework.Equipment;
import abstruct_framework.FullGear;

public class WeaponFullGear extends FullGear {
    @Override
    public void display(Player player) {
        for (Equipment equipment : equipments) {
            equipment.Equip(player);
        }
    }
}
