package Unit;

public class Hero extends Unit{
     public Hero() {
        super(HEALTH, DAMAGE, null);
    }

    public int SuperStrike (int dmg){
        return dmg * 2;
    }
}
