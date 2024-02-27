import java.util.function.Consumer;

// Main.java
public class Main {
    private static DamageCalculator damage;
    private static Console console;

    public static void main(String[] args) {
        Main.damage = new BaseDamageFactory().createDamageCalculator(null);
        Main.console = new Console();
        State state = State.START;

        while (state != State.DONE) {
            state = switch (state) {
                case START -> Main.executeStarting();
                case COMMAND -> Main.executeCommand();
                default -> throw new IllegalStateException();
            };
        }

        Main.console.writeLine("Totale schade: " + Main.damage.calculateDamage());
    }

    public static State executeStarting() {
        Main.console.writeLine("Schade Rekenmachine");
        Main.console.writeLine("Door: Julia & Manon");
        Main.console.writeLine("-------------------------------------------");
        Main.console.writeLine("Type 'magie' om magie schade toe te voegen.");
        Main.console.writeLine("Type 'bonus' om bonus schade toe te voegen");
        Main.console.writeLine("Type 'afsluiten' om het resultaat te tonen.");
        Main.console.writeLine("");
        return State.COMMAND;
    }

    public static State executeCommand() {
        Main.console.writeLine("Type het commando: ");
        String answer = Main.console.readLine();

        switch(answer) {
            case "magie":
            case "bonus": addDamage(answer); break;
            case "afsluiten": return State.DONE;
            default: Main.console.writeLine("Commando bestaat niet, probeer opnieuw.");
        }

        return State.COMMAND;
    }

    private static void addDamage(String damageType) {
        switch (damageType) {
            case "magie": Main.damage = new MagicDamageFactory().createDamageCalculator(Main.damage); break;
            case "bonus": Main.damage = new BonusDamageFactory().createDamageCalculator(Main.damage); break;
        }

        Main.console.writeLine("Schade toegevoegd!");
    }
}
