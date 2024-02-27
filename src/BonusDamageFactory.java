public class BonusDamageFactory implements DamageFactoryInterface {

    @Override
    public DamageCalculator createDamageCalculator(DamageCalculator calculator) {
        return new BonusDamageDecorator(calculator);
    }
}
