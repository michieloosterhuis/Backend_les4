public class Main {
    public static void main(String[] args) {


        Pikachu pikachu = new Pikachu(
                "electric",
                "Pikachu",
                2,
                "yellow",
                true,
                22.4);
        pikachu.speaks();
        pikachu.eats();
        pikachu.thunderPunch();
        pikachu.voltTackle(230);
        System.out.println("Number of pokemon: " + pikachu.getPokemonAmount());

        Charmander charmander = new Charmander(
                "fire",
                "Charmander",
                76.3,
                true,
                6,
                "green");
        charmander.speaks();
        charmander.eats();
        charmander.fireLash();
        charmander.flameThrower();
        System.out.println("Number of pokemon: " + charmander.getPokemonAmount());
    }
}
