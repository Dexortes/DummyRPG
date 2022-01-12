package BattleProc;

import Unit.Hero;
import Unit.Monster;

import java.util.Scanner;

public class Main {
    private static boolean gameOn = true;
    private static int menuLvl = 0;                                 // Level 0 - preparation stage, level 1 - battle is in process
    private static final Hero hero = new Hero();
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hi-hi. This is a short version of combat scene.");
        while(gameOn){
            if(menuLvl == 0){
                System.out.println("""
                        Preparation time!
                        1. Name your hero.
                        2. Fight.
                        3. Exit.
                        """);
                int choice = input.nextInt();
                switch (choice) {
                    case 1 -> {
                        if (hero.getName() == null) {
                            menuLvl = 1;
                        } else {
                            System.out.println("Hero already has a name. Stop spamming!");
                        }
                    }
                    case 2 -> {
                        if (hero.getName() == null) {
                            System.out.println("Name your hero, sir");
                        } else {
                            System.out.println("Here we go!");
                            battle();
                        }
                    }
                    case 3 -> {
                        System.out.println("Oh, well. C ya then.");
                        gameOn = false;
                    }
                    default -> {
                        System.out.println("Three digits, sir, just three. Don't miss 'em please.");
                    }
                }
            } else if (menuLvl == 1){
                menuLvl1();
            }
        }
    }

    private static void battle(){
        Monster monster = new Monster();
        Fight fight = new Fight(hero, monster);
        fight.action();
    }

    public static void menuLvl1 (){
        System.out.println("So, what's the name?");
        Scanner heroName = new Scanner(System.in);
        String name = heroName.nextLine();
        hero.setName(name);
        System.out.println("I see... I see... So it's " + hero.getName() + "? Well, *whispering* could've be worse");
        menuLvl = 0;
    }
}
