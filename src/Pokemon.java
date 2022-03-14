abstract public class Pokemon {

    // instance variables
    private String type;
    private String name;
    private static int pokemonAmount = 0;

    // constructor
    public Pokemon(String type, String name) {
        ++pokemonAmount;
        this.type = type;
        this.name = name;
    }

    // getters
    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getPokemonAmount() {
        return pokemonAmount;
    }

    // setters
    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    // methods
    public void eats() {
        System.out.println(name + " is eating.");
    }

    public void speaks() {
        System.out.println(name + " is speaking.");
    }

}
