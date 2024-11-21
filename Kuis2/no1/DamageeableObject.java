package Kuis2.no1;

public abstract class DamageeableObject extends GameObject {
    public int MaxHealth;
    public int Health;

    public DamageeableObject(String name, int postX, int PostY, int maxHealth) {
        super(name, postX, PostY);
        this.MaxHealth = maxHealth;
        this.Health = maxHealth;
    }
    public boolean isDead(){
        return Health <= 0;
    }
    public void takeDamage(int damage){
        Health -=damage;
        if (Health < 0) {
            Health = 0;
        }
        if (isDead()){
            onKilled();
        }
    }
    public abstract void onKilled();
}
