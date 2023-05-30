package HW7.Character;

import HW7.Weapons.Bow;
public class Archer {
    private String name;
    private int health;
    private int damage;
    private Bow bow;

    public Archer(String name, int health, int damage, Bow bow){
       this.name = name;
       this.health = health;
       this.damage = damage;
       this.bow = bow;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setBow(Bow bow) {
        if(bow.getName().equals("Bow")) {
            this.bow = bow;
        }
    }

    public Bow getBow() {
        return bow;
    }
    public void attack(Archer warrior) {
        int warriorHealth = warrior.getHealth() - this.damage;
        warrior.setHealth(warriorHealth);
    }
    public void shot(Swordsman warrior) {
        int warriorHealth = warrior.getHealth() - this.bow.getDamage();
        warrior.setHealth(warriorHealth);
    }
}
