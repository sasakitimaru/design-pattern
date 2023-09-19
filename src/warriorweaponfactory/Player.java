package warriorweaponfactory;

import abstruct_framework.Equipment;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final String name;
    private final List<Equipment> equipments = new ArrayList<Equipment>();
    int attackStatus;
    int defenseStatus;
    int strengthStatus;
    int weightStatus;

    public Player(String name, int attackStatus, int defenseStatus, int strengthStatus, int weightStatus) {
        this.name = name;
        this.attackStatus = attackStatus;
        this.defenseStatus = defenseStatus;
        this.strengthStatus = strengthStatus;
        this.weightStatus = weightStatus;
    }

    public void setStatus(Integer attackStatus, Integer defenseStatus) {
        if (attackStatus != null) {
            this.attackStatus += attackStatus;
        }
        if (defenseStatus != null) {
            this.defenseStatus += defenseStatus;
        }
    }
    public void setEquipments(Equipment equipment) {
        this.equipments.add(equipment);
    }
    public void showEquipments() {
        if(this.equipments.isEmpty()) {
            System.out.println("NO EQUIPMENTS");
            return;
        }
        System.out.println("-------EQUIPMENTS-------");
        for (Equipment equipment : this.equipments) {
            System.out.println(equipment.toString());
        }
        System.out.println("------------------------");
    }

    public int getAttackStatus() {
        return this.attackStatus;
    }

    public int getDefenseStatus() {
        return this.defenseStatus;
    }

    public int getStrengthStatus() {
        return this.strengthStatus;
    }

    public int getWeightStatus() {
        return this.weightStatus;
    }

    public void showStatus() {
        System.out.println("====PLAYER STATUS====");
        System.out.println("Player: " + name);
        showEquipments();
        System.out.println("Attack: " + attackStatus);
        System.out.println("Defense: " + defenseStatus);
        System.out.println("=====================");
    }
}
