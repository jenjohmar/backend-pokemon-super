import java.util.Arrays;

public class ElectricPokemon extends Pokemon{
    private boolean eatsBatteries;
    private final String[] electricWeaknesses = new String[]{"Ground"};;
    public ElectricPokemon(String name, String type, boolean eatsBatteries) {
        super(name, type);
        this.eatsBatteries = eatsBatteries;
    }

    public void electroBall() {
        System.out.println(this.getName() + " shoots electro ball ZZZZZ!");
    }
    public void voltTackle() {
        System.out.println(this.getName() + " shoots Volt tackle ZAPP!");
    }

    public boolean isEatsBatteries() {
        return eatsBatteries;
    }

    public void setEatsBatteries(boolean eatsBatteries) {
        this.eatsBatteries = eatsBatteries;
    }

    public String[] getElectricWeaknesses() {
        return electricWeaknesses;
    }

    @Override
    void eats() {
        if(eatsBatteries) {
            System.out.println(this.getName() + " the " + this.getType() + " Pokemon" + " is eating batteries");
        } else{
            System.out.println(this.getName() + " the " + this.getType() + " Pokemon" + " is eating");
        }
    }

    @Override
    void sleeps() {
        System.out.println(this.getName() + " the " + this.getType() + " Pokemon" + " is sleeping");
    }
}
