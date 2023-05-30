package HW7.Weapons;

public class Bow {
    private String name;
    private int damage;
    public Bow(String name,int damage){
        this.name = name;
        this.damage = damage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

}
