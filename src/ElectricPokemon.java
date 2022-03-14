public class ElectricPokemon extends Pokemon {

    // instance variables
    private int voltageLevel;
    private boolean isAlone;

    // constructor
    public ElectricPokemon(String name, int level, String food, String sound) {
        super(name, level, food, sound);
        this.voltageLevel = 230;
        this.isAlone = false;
    }

    // getters
    public int getVoltageLevel() {
        return voltageLevel;
    }

    public boolean isAlone() {
        return isAlone;
    }

    // setters
    public void setVoltageLevel(int voltageLevel) {
        this.voltageLevel = voltageLevel;
    }

    public void setAlone(boolean alone) {
        isAlone = alone;
    }

    // methods
    @Override
    public void eats() {
        super.eats();
        System.out.println("Ik vind het eten super lekker.");
    }

    @Override
    public void speaks() {
        System.out.println("Ik kijk graag naar het onweer.");
    }

    public void thunderPunch() {
        System.out.println(super.getName() + " does a thunder-punch.");
    }

    public void voltTackle() {
        System.out.println(super.getName() + " does a volt-tackle.");
    }

}
