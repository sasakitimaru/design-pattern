package strategy;

public enum Type {
    FIRE("fire", 0),
    GRASS("grass", 1),
    WATER("water", 2);
    private final String typeName;
    private final int typeValue;

    Type(String typeName, int typeValue) {
        this.typeName = typeName;
        this.typeValue = typeValue;
    }

    public int getTypeValueFromName(String typeName) {
        for (Type type : Type.values()) {
            if (type.typeName.equals(typeName)) {
                return type.typeValue;
            }
        }
        System.out.println("Invalid type name");
        return -1;
    }
    public boolean isSuperEffectiveType(Type type) {
        return (this.typeValue + 1) % 3 == type.typeValue;
    }
    public boolean isWeakType(Type type) {
        return (this.typeValue + 2) % 3 == type.typeValue;
    }
}