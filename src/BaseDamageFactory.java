public class BaseDamageFactory implements DamageFactoryInterface{

    @Override
    public DamageCalculator createDamageCalculator(DamageCalculator calculator) {
        return new DamageCalculator.Builder().baseDamage().build();
    }
}
