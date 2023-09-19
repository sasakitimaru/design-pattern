package abstruct_framework;

import warriorweaponfactory.Player;

import java.util.*;

public abstract class FullGear {
    protected List<Equipment> equipments = new ArrayList<>();
    public void add(List<Equipment> _equipments) {
        equipments.addAll(_equipments);
    }
    public abstract void SetUpEquipments(Player player);
}
