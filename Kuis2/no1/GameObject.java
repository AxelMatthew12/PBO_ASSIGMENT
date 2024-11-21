package Kuis2.no1;

public  class GameObject {
    protected String name;
    protected int PostX;
    protected int PostY;

    public GameObject(String name, int PostX, int PostY) {
        this.name = name;
        this.PostX = PostX;
        this.PostY = PostY;
    }

    public void Despawn(){
        System.out.println(name + "Telah di keluarkan dari game.");
    }
}
