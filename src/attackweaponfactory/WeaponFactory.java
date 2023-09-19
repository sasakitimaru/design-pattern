package attackweaponfactory;

import abstruct_framework.Factory;
import abstruct_framework.FullGear;
import abstruct_framework.Weapon;

public class WeaponFactory extends Factory {
    @Override
    public Weapon createWeapon(String classname, String name, int attackStatus, int defenseStatus, int strengthStatus) {
        Weapon weapon = null;
        try {
            weapon = (Weapon) Class.forName(classname).getDeclaredConstructor(String.class, int.class, int.class, int.class).newInstance(name, attackStatus, defenseStatus, strengthStatus);
        } catch (ClassNotFoundException e) {
            System.out.println("Class " + classname + " not found.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return weapon;
    }

    @Override
    public FullGear createFullGear() {
        return new WeaponFullGear();
    }
}
