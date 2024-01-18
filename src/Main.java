// Main.java
public class Main {
    public static void main(String[] args) {
        // Creëer een fysieke schadecalculator met basisschade.
        DamageCalculator physicalDamageCalculator = DamageTypeFactory.createPhysicalDamageCalculator(100);

        // Decorate de fysieke schadecalculator met bonus- en magische schade.
        DamageDecorator decoratedCalculator = DamageTypeFactory.createBonusDamageDecorator(
                DamageTypeFactory.createMagicDamageDecorator(physicalDamageCalculator, 30),
                20
        );

        // Bereken en laat de totale schade zien.
        double totalDamage = decoratedCalculator.calculateDamage();
        System.out.println("Total Damage: " + totalDamage);
    }
}
