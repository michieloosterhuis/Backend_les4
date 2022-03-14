public class Charmander extends Pokemon {

    // instance variables
    private double tailLength;
    private boolean hasFlame;
    private int level;
    private String eyeColor;

    // constructor
    public Charmander(String type, String name, double tailLength, boolean hasFlame, int level, String eyeColor) {
        super(type, name);
        this.tailLength = tailLength;
        this.hasFlame = hasFlame;
        this.level = level;
        this.eyeColor = eyeColor;
    }

    // setters
    public double getTailLength() {
        return tailLength;
    }

    public boolean isHasFlame() {
        return hasFlame;
    }

    public int getLevel() {
        return level;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    // getters
    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

    public void setHasFlame(boolean hasFlame) {
        this.hasFlame = hasFlame;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    // methods
    public void fireLash() {
        System.out.println(super.getName() + " does a fire-lash.");
    }

    public void flameThrower() {
        System.out.println(super.getName() + " does a flame-thrower.");
    }
}
