// MagicDamageDecorator.java
public class MagicDamageDecorator extends DamageDecorator {
    private double magicDamage;

    public MagicDamageDecorator(DamageCalculator damageCalculator, double magicDamage) {
        super(damageCalculator);
        this.magicDamage = magicDamage;
    }

    @Override
    public double calculateDamage() {
        return super.calculateDamage() + magicDamage;
    }
}
