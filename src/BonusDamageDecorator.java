// BonusDamageDecorator.java
public class BonusDamageDecorator extends DamageDecorator {
    private double bonusDamage;

    public BonusDamageDecorator(DamageCalculator damageCalculator, double bonusDamage) {
        super(damageCalculator);
        this.bonusDamage = bonusDamage;
    }

    @Override
    public double calculateDamage() {
        return super.calculateDamage() + bonusDamage;
    }
}
