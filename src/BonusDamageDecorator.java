// BonusDamageDecorator.java
public class BonusDamageDecorator extends DamageDecorator {
    private double bonusDamage = 20;

    public BonusDamageDecorator(DamageCalculator damageCalculator) {
        super(damageCalculator);
    }

    @Override
    public double calculateDamage() {
        return super.calculateDamage() + bonusDamage;
    }
}
