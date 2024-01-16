// Main.java
public class Main {
    public static void main(String[] args) {
        // Create a physical damage calculator with base damage
        DamageCalculator physicalDamageCalculator = DamageTypeFactory.createPhysicalDamageCalculator(100);

        // Decorate the physical damage calculator with bonus and magic damage
        DamageDecorator decoratedCalculator = DamageTypeFactory.createBonusDamageDecorator(
                DamageTypeFactory.createMagicDamageDecorator(physicalDamageCalculator, 30),
                20
        );

        // Calculate and display the total damage
        double totalDamage = decoratedCalculator.calculateDamage();
        System.out.println("Total Damage: " + totalDamage);
    }
}
