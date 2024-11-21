package Kuis2.no1;

public class Monster extends DamageeableObject {
    protected int threatLevel;
    protected String color;

    public Monster(String name, int posX, int posY, int maxHealth, int threatLevel, String color) {
        super(name, posX, posY, maxHealth);
        this.threatLevel = threatLevel;
        this.color = color;
    }

    public String makeNoise() {
        return "Grrrr!";
    }

    @Override
    public void onKilled() {
        System.out.println(name + " was slain! Level yg di kalahkan: " + threatLevel);
    }
}
