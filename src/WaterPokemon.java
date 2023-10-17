import java.util.Arrays;

public class WaterPokemon extends Pokemon{
    private double weight;
    private final String[] waterWeaknesses = new String[]{"Grass", "Electric"};;

    public WaterPokemon(String name, String type, double weight) {
        super(name, type);
        this.weight = weight;
    }
    public void hydroPump() {
        System.out.println(this.getName() + " pumps hydro GURGLLE!");
    }
    public void rainDance() {
        System.out.println(this.getName() + " is dancing to make it RAIN!");
    }

    public double getWeight() {
        System.out.println(this.getName() + " weighs " + weight + " kg");
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String[] getWaterWeaknesses() {
        System.out.println(this.getName() + " weaknesses are: " + Arrays.toString(waterWeaknesses));
        return waterWeaknesses;
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
