package abstruct_framework;

import attackweaponfactory.Player;

import java.util.*;

public abstract class FullGear {
    protected List<Equipment> equipments = new ArrayList<>();
    public void add(List<Weapon> weapons) {
        equipments.addAll(weapons);
    }
    public abstract void display(Player player);
}
