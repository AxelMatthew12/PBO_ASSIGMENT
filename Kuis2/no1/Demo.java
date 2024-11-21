package Kuis2.no1;

public class Demo {
    public static void main(String[] args) {
        Player player = new Player("Hero", 0, 0, 100, 3);
        Monster monster = new Monster("Goblin", 5, 5, 50, 10, "Green");

        System.out.println(player.name + " encounters a " + monster.color + " " + monster.name + "!");
        monster.takeDamage(60);
        player.takeDamage(120);
    }
}
