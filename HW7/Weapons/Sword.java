package HW7.Weapons;

public class Sword {
    private String name;
    private int damage;
    public Sword(String name,int damage){
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
