// DamageDecorator.java
public abstract class DamageDecorator extends DamageCalculator {
    protected DamageCalculator damageCalculator;

    public DamageDecorator(DamageCalculator damageCalculator) {
        super(new DamageCalculator.Builder()); // Dummy builder to satisfy the superclass
        this.damageCalculator = damageCalculator;
    }

    @Override
    public double calculateDamage() {
        return damageCalculator.calculateDamage();
    }
}
