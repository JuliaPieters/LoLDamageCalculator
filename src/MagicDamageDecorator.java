// MagicDamageDecorator.java
public class MagicDamageDecorator extends DamageDecorator {
    private double magicDamage = 30;

    public MagicDamageDecorator(DamageCalculator damageCalculator) {
        super(damageCalculator);
    }

    @Override
    public double calculateDamage() {
        return super.calculateDamage() + magicDamage;
    }
}
