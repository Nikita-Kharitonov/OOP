package HW7;
import HW7.Character.Archer;
import HW7.Character.Swordsman;
import HW7.Weapons.Bow;
import HW7.Weapons.Sword;

public class Fight {
    public static void main(String[] args){
        Archer archer = new Archer("Лучник ",100,10,new Bow("Лук",5));
        Swordsman swordsman = new Swordsman("Мечник ",150,15,new Sword("Меч",8));
        while (archer.getHealth() > 0 && swordsman.getHealth() > 0) {
            archer.shot(swordsman);
            System.out.println(swordsman.getName() + "Здоровье: " + swordsman.getHealth());
            if (swordsman.getHealth() > 0){
                swordsman.attack(archer);
                System.out.println(archer.getName() + "Здоровье: " + archer.getHealth());
            }
        }
    }
}
