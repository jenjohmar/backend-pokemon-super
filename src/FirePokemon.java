import java.sql.Array;
import java.util.Arrays;

public class FirePokemon extends Pokemon {
    private double height;
    private final String[] fireWeaknesses = new String[]{"Water", "Ground", "Rock"};
    public FirePokemon(String name, String type, double height) {
        super(name, type);
        this.height = height;
    }

    public double getHeight() {
        System.out.println(this.getName() + " is " + height + " cm tall.");
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void fireBall() {
        System.out.println(this.getName() + " throws fireball BOOOMMM!");
    }
    public void flameThrower() {
        System.out.println(this.getName() + " uses flame thrower WHOOSSHH!");
    }

    public String[] getFireWeaknesses() {
        System.out.println(this.getName() + " weaknesses are: " + Arrays.toString(fireWeaknesses));
        return fireWeaknesses;
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
