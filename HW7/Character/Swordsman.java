package HW7.Character;

import HW7.Weapons.Sword;
public class Swordsman {
        private String name;
        private int health;
        private int damage;
        private Sword sword;

        public Swordsman(String name, int health, int damage, Sword sword){
            this.name = name;
            this.health = health;
            this.damage = damage;
            this.sword = sword;
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

        public void setSword(Sword sword) {
            if (sword.getName().equals("Sword")) {

                this.sword = sword;
            }
        }

        public Sword getSword() {

            return sword;
        }
        public void attack(Archer warrior) {
            int warriorHealth = warrior.getHealth() - this.damage;
            warrior.setHealth(warriorHealth);
        }
    }
