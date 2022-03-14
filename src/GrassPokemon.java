import java.util.PrimitiveIterator;

public class GrassPokemon extends Pokemon {

    // instance variables
    private String tailColor;
    private boolean likesFlowers;


    // constructor
    public GrassPokemon(String name, int level, String food, String sound) {
        super(name, level, food, sound);
        this.tailColor = "green";
        this.likesFlowers = true;
    }

    // getters
    public String getTailColor() {
        return tailColor;
    }

    public boolean isLikesFlowers() {
        return likesFlowers;
    }

    // setters
    public void setTailColor(String tailColor) {
        this.tailColor = tailColor;
    }

    public void setLikesFlowers(boolean likesFlowers) {
        this.likesFlowers = likesFlowers;
    }

    //methods
    @Override
    public void eats() {
        super.eats();
        System.out.println("Ik vind het eten niet lekker.");
    }

    @Override
    public void speaks() {
        System.out.println("Ik lig graag in het gras.");
    }

    public void leafStorm() {
        System.out.println(super.getName() + " does a leaf-storm.");
    }

    public void leaveBlade() {
        System.out.println(super.getName() + " does a leave-blade.");
    }
}
