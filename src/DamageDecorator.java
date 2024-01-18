// DamageDecorator.java
public abstract class DamageDecorator extends DamageCalculator {
    protected DamageCalculator damageCalculator;

    public DamageDecorator(DamageCalculator damageCalculator) {
        super(new DamageCalculator.Builder()); // Dummy builder om aan de superklasse te voldoen.
        this.damageCalculator = damageCalculator;
    }

    @Override
    public double calculateDamage() {
        return damageCalculator.calculateDamage();
    }
}
