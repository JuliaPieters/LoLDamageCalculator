// DamageTypeFactory.java
public class DamageTypeFactory {
    public static DamageCalculator createPhysicalDamageCalculator(double baseDamage) {
        return new DamageCalculator.Builder().baseDamage(baseDamage).build();
    }

    public static DamageDecorator createMagicDamageDecorator(DamageCalculator calculator, double magicDamage) {
        return new MagicDamageDecorator(calculator, magicDamage);
    }

    public static DamageDecorator createBonusDamageDecorator(DamageCalculator calculator, double bonusDamage) {
        return new BonusDamageDecorator(calculator, bonusDamage);
    }
}
