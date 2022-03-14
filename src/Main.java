import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 15,"hete bliksem", "Fizzz");
        FirePokemon charmander = new FirePokemon("Charmander", 32, "brandhout", "Blizzz");
        WaterPokemon squirtle = new WaterPokemon("Squirtle", 23, "zeewier", "Blubzzz");
        GrassPokemon bulbasaur = new GrassPokemon("Bulbasaur", 55, "bloemetjes", "Wozzz");

        ArrayList<Pokemon> pokemonList = new ArrayList<>();
        pokemonList.add(pikachu);
        pokemonList.add(charmander);
        pokemonList.add(squirtle);
        pokemonList.add(bulbasaur);

        for (Pokemon pokemon : pokemonList) {
            pokemon.speaks();
            pokemon.eats();
            System.out.println();
        }

        pikachu.thunderPunch();
        charmander.flameThrower();
        squirtle.hydroPump();
        bulbasaur.leafStorm();
    }
}
