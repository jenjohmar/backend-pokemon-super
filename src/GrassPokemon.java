import java.util.Arrays;

public class GrassPokemon extends Pokemon{
    private int level;
    private final String[] grassWeaknesses = new String[]{"Fire", "Psychic", "Ice", "Flying"};;
    public GrassPokemon(String name, String type, int level) {
        super(name, type);
        this.level = level;
    }

    public void hydroPump() {
        System.out.println(this.getName() + " pumps hydro GURGLLE!");
    }
    public void rainDance() {
        System.out.println(this.getName() + " is dancing to make it RAIN!");
    }

    public double getLevel() {
        System.out.println(this.getName() + " is a level " + level + " Pokemon");
        return level;
    }

    public void setWeight(int level) {
        this.level = level;
    }

    public String[] getGrassWeaknesses() {
        System.out.println(this.getName() + " weaknesses are: " + Arrays.toString(grassWeaknesses));
        return grassWeaknesses;
    }

    @Override
    void eats() {
        System.out.println(this.getName() + " the " + this.getType() + " Pokemon" + " is eating");
    }

    @Override
    void sleeps() {
        System.out.println(this.getName() + " the " + this.getType() + " Pokemon" + " is sleeping");
    }
}
