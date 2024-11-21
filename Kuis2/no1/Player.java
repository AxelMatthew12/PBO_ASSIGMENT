package Kuis2.no1;

public class Player extends DamageeableObject {
    private int score;
    private int livesRemaining;

    public Player(String name, int posX, int posY, int maxHealth, int livesRemaining) {
        super(name, posX, posY, maxHealth);
        this.score = 0;
        this.livesRemaining = livesRemaining;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int points) {
        score += points;
    }

    public int getLivesRemaining() {
        return livesRemaining;
    }

    @Override
    public void onKilled() {
        livesRemaining--;
        System.out.println(name + " was killed! Nyawa tersisa: " + livesRemaining);
        if (livesRemaining <= 0) {
            System.out.println(name + " Tidak ada NyawaTersisa. Game over!");
        }
    }
}
