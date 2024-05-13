import java.util.Random;

public class Personagem {

    private String name;
    private int hp;
    private int attack;
    private int defense;

    Random rand = new Random();

    public Personagem(String name) {
        this.name = name;
        this.hp = 100;
        this.attack = rand.nextInt(20, 30);
        this.defense = rand.nextInt(10,15);
    }

    public void attack(Personagem p) {
        if(this.hp > 0 && p.getHp() > 0) {
            p.setHp(p.getHp() - (this.attack - p.getDefense()));
        }
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDefense() {
        return defense;
    }

    public String getName() {
        return name;
    }

}
