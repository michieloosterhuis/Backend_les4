public class WaterPokemon extends Pokemon {

    // instance variables
    private double weight;
    private boolean canSwim;


    // constructor
    public WaterPokemon(String name, int level, String food, String sound) {
        super(name, level, food, sound);
        this.weight = 44.2;
        this.canSwim = true;
    }

    // getters
    public double getWeight() {
        return weight;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    // setters
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    //methods
    @Override
    public void eats() {
        super.eats();
        System.out.println("Ik vind het eten lekker.");
    }

    @Override
    public void speaks() {
        System.out.println("Ik hou van zwemmen.");
    }

    public void surf() {
        System.out.println(super.getName() + " is surfing.");
    }

    public void hydroPump() {
        System.out.println(super.getName() + " does a hydro-pump.");
    }
}
