package warriorweaponfactory;

import abstruct_framework.Equipment;
import abstruct_framework.Protector;
import abstruct_framework.Weapon;
import abstruct_framework.FullGear;

public class WarriorFullGear extends FullGear {
    @Override
    public void SetUpEquipments(Player player) {
        for (Equipment equipment : equipments) {
            if (equipment instanceof Weapon) {
                equipment.checkAndEquip(player, player.strengthStatus);
            } else if (equipment instanceof Protector) {
                equipment.checkAndEquip(player, player.weightStatus);
            } else {
                System.out.println("ERROR: UNKNOWN EQUIPMENT TYPE");
            }
        }
    }
}
