package strategy;

public enum Pokemon {
    IVYSAUR(Type.GRASS, 60, 62, 63, 80, 80, 60),
    CHARIZARD(Type.FIRE, 78, 84, 78, 109, 85, 100),
    SQUIRTLE(Type.WATER, 44, 48, 65, 50, 64, 43),
    SQUIRT(Type.WATER, 40, 48, 50, 55, 60, 45),
    TANGLEA(Type.GRASS, 65, 55, 115, 100, 40, 60),
    MAGMAR(Type.FIRE, 65, 95, 57, 100, 85, 93);

    private final Type type;
    private int hp;
    private final int atk;
    private final int def;
    private final int spAtk;
    private final int spDef;
    private final int spd;

    Pokemon(Type type, int hp, int atk, int def, int spAtk, int spDef, int spd) {
        this.type = type;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spAtk = spAtk;
        this.spDef = spDef;
        this.spd = spd;
    }

    public int getHp() {
        return this.hp;
    }

    public boolean isGreaterDef(Pokemon pokemon) {
        return this.def > pokemon.def;
    }

    public boolean isSuperEffective(Pokemon pokemon) {
        return this.type.isSuperEffectiveType(pokemon.type);
    }

    public boolean isWeak(Pokemon pokemon) {
        return this.type.isWeakType(pokemon.type);
    }

    public boolean willMoveFirst(Pokemon opponent) {
        if (this.spd > opponent.spd) {
            return true;
        } else if (this.spd < opponent.spd) {
            return false;
        } else {
            return Math.random() < 0.5;
        }
    }

    public void processDamage(Pokemon opponent, boolean isPhysicalAttack) {
        int baseDamage = calculateDamage(opponent, isPhysicalAttack);
        setDamage(opponent, baseDamage);
    }

    public int calculateDamage(Pokemon opponent, boolean isPhysicalAttack) {
        double usedAtk = isPhysicalAttack ? this.atk : this.spAtk;
        double usedDef = isPhysicalAttack ? opponent.def : opponent.spDef;
        double baseDamage = (usedAtk / usedDef) * 10;

        if (this.isSuperEffective(opponent)) {
            baseDamage *= 2.0;
            System.out.println("It's super effective!");
        } else if (this.isWeak(opponent)) {
            System.out.println("It's not very effective...");
            baseDamage *= 0.5;
        }
        return (int) baseDamage;
    }
    private void setDamage(Pokemon opponent, int damage) {
        opponent.hp = Math.max(opponent.hp - damage, 0);
    }
}
