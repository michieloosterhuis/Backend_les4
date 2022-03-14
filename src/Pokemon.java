abstract public class Pokemon {

    // static variables
    private static int pokemonAmount = 0;

    // instance variables
    private String name;
    private int level;
    private String food;
    private String sound;

    // constructor
    public Pokemon(String name, int level, String food, String sound) {
        this.name = name;
        this.level = level;
        this.food = food;
        this.sound = sound;
    }

    // getters
    public static int getPokemonAmount() {
        return pokemonAmount;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    // methods
    public void eats() {
        System.out.println(name + " eet meestal " + food + ".");
    };

    public abstract void speaks();

}
