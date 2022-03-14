public class FirePokemon extends Pokemon {

    // instance variables
    private boolean isOnFire;
    private double bodyTemperature;

    // constructor
    public FirePokemon(String name, int level, String food, String sound) {
        super(name, level, food, sound);
        this.isOnFire = true;
        this.bodyTemperature = 77.3;
    }

    // getters
    public boolean isOnFire() {
        return isOnFire;
    }

    public double getBodyTemperature() {
        return bodyTemperature;
    }

    // setters
    public void setOnFire(boolean onFire) {
        isOnFire = onFire;
    }

    public void setBodyTemperature(double bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    // methods
    @Override
    public void eats() {
        super.eats();
        System.out.println("Ik vind het eten goor.");
    }

    @Override
    public void speaks() {
        System.out.println("Ik hou van een vuurtje stoken.");
    }

    public void fireLash() {
        System.out.println(super.getName() + " does a fire-lash.");
    }

    public void flameThrower() {
        System.out.println(super.getName() + " does a flame-thrower.");
    }
}
