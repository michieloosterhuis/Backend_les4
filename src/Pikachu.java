public class Pikachu extends Pokemon {
    // instance variables
    private int numberOfEars;
    private String skinColor;
    private boolean hasSpecks;
    private double weight;

    // constructor
    public Pikachu(String type, String name, int numberOfEars, String skinColor, boolean hasSpecks, double weight) {
        super(type, name);
        this.numberOfEars = numberOfEars;
        this.skinColor = skinColor;
        this.hasSpecks = hasSpecks;
        this.weight = weight;
    }

    // getters
    public int getNumberOfEars() {
        return numberOfEars;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public boolean isHasSpecks() {
        return hasSpecks;
    }

    public double getWeight() {
        return weight;
    }

    // setters
    public void setNumberOfEars(int numberOfEars) {
        this.numberOfEars = numberOfEars;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public void setHasSpecks(boolean hasSpecks) {
        this.hasSpecks = hasSpecks;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // methods
    public void thunderPunch() {
        System.out.println(super.getName() + " does a thunder-punch.");
    }

    public void voltTackle(int voltage) {
        System.out.println(super.getName() + " does a volt-tackle with with a strength of " + voltage + " volt");
    }

}
