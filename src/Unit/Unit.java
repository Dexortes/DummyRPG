package Unit;

public class Unit {

    public static final int HEALTH = 100;
    public static final int DAMAGE = 5;


    int hp = 100;
    int dmg = 5;
    String name;

    public Unit(int hp, int dmg, String name) {
        this.hp = hp;
        this.dmg = dmg;
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
