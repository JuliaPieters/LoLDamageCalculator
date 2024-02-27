public class MagicDamageFactory implements DamageFactoryInterface {

    @Override
    public DamageCalculator createDamageCalculator(DamageCalculator calculator) {
        return new MagicDamageDecorator(calculator);
    }
}
