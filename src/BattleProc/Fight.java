package BattleProc;

import Unit.Hero;
import Unit.Monster;

import java.util.Scanner;

public class Fight {
    private final Hero hero;
    private final Monster monster;
    private final Scanner input = new Scanner(System.in);

    public Fight(Hero hero, Monster monster) {
        this.hero = hero;
        this.monster = monster;
    }

    public void action(){
        while(hero.getHp() > 0 && monster.getHp() > 0){
            System.out.println("Hero's hp: " + hero.getHp() + "\nMonster's hp: " + monster.getHp());
            System.out.println("Actions? \n1. Hit with right hand. \n2. Hit with... wait a second. Ye, right - hit with left hand. \n3. Headbutt.");
            int choice = input.nextInt();
            switch (choice) {
                case 1 -> {
                    attack(hero, monster);
                    System.out.println("Right hook!");
                }
                case 2 -> {
                    attack(hero, monster);
                    System.out.println("Left hook!");
                }
                case 3 -> {
                    attack(hero, monster);
                    System.out.println("Headbutt!");
                }
                default -> System.out.println("There are just 3 digits...");
            }
        }
        if(hero.getHp() <= 0){
            System.out.println("DEFEAT!");
        } else if (monster.getHp() <= 0){
            System.out.println("Victory...");
        }
    }

    private void attack(Hero hero, Monster monster){
        monster.setHp(monster.getHp() - hero.getDmg());
        System.out.println(hero.getName() + " attacked " + monster.getName() + " for " + hero.getDmg() + ".");
        hero.setHp(hero.getHp() - monster.getDmg());
        System.out.println(monster.getName() + " attacked " + hero.getName() + " for " + monster.getDmg() + ".");
    }
}
