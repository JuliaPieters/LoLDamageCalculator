// DamageCalculator.java
public class DamageCalculator {
    private double baseDamage;

    DamageCalculator(Builder builder) {
        this.baseDamage = builder.baseDamage;
    }

    public double calculateDamage() {
        return baseDamage;
    }

    // Builder class
    public static class Builder {
        private double baseDamage = 100;

        public Builder baseDamage() {

            return this;
        }

        public DamageCalculator build() {
            return new DamageCalculator(this);
        }
    }
}
