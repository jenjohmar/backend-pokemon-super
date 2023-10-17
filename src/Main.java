import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        FirePokemon brian = new FirePokemon("Brian", "Fire", 0.98);
        WaterPokemon john = new WaterPokemon("John", "Water", 12);
        ElectricPokemon mabel = new ElectricPokemon("Mabel", "Electric", true);
        ElectricPokemon susan = new ElectricPokemon("Susan", "Electric", false);
        GrassPokemon bert = new GrassPokemon("Bert", "Grass", 5);

        brian.eats();
        john.sleeps();

        brian.fireBall();
        brian.flameThrower();
        brian.getHeight();
        john.getWeight();
        john.getWaterWeaknesses();
        brian.getFireWeaknesses();
        mabel.eats();
        susan.eats();
        bert.getLevel();
        bert.addType("Ground");
        bert.eats();


    }

}