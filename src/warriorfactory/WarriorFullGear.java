package warriorfactory;

import abstruct_framework.Equipment;
import abstruct_framework.Protector;
import abstruct_framework.FullGear;

public class WarriorFullGear extends FullGear {
    @Override
    public void SetUpEquipments(Player player) {
        for (Equipment equipment : equipments) {
            if ((equipment instanceof Sword) || (equipment instanceof Shield)) {
                equipment.checkAndEquip(player, player.getStrengthStatus());
            } else if (equipment instanceof Armor) {
                equipment.checkAndEquip(player, player.getWeightStatus());
            } else {
                System.out.println("ERROR: UNKNOWN EQUIPMENT TYPE");
            }
        }
    }
}
