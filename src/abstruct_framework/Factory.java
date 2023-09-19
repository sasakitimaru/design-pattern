package abstruct_framework;

public abstract class Factory {
    public static Factory getFactory(String classname) {
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(classname).getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException e) {
            System.out.println("Class " + classname + " not found.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Weapon createWeapon(String classname, String name, int attackStatus, int defenseStatus, int requiredStatus);
    public abstract Protector createProtector(String classname, String name, int requiredStatus, int defenseStatus);
    public abstract FullGear createFullGear();
}
