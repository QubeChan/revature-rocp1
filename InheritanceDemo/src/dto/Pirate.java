package dto;

public class Pirate extends Person {
    private int hp, mp;
    private DevilFruit devilFruit;
    private Weapon weapon;

    public Pirate(String name, int hp, int mp, DevilFruit devilFruit, Weapon weapon) {
        super(name);
        this.hp = hp;
        this.mp = mp;
        this.devilFruit = devilFruit;
        this.weapon = weapon;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public DevilFruit getDevilFruit() {
        return devilFruit;
    }

    public void setDevilFruit(DevilFruit devilFruit) {
        this.devilFruit = devilFruit;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Name: " + getName() +
                "\nHP: " + hp +
                "\nMP: " + mp +
                "\n" + getDevilFruit() +
                "\n" + getWeapon();
    }
}
