package UTS.Soalno2;

public class Sepeda {
    private int gear;
    private double speed;

    public Sepeda() {
        System.out.println("Objek dari class Sepeda dibuat");
    }

    public void intiinfo() {
        System.out.println("Your speed is : " + speed);
        System.out.println("Gear : " + gear);
    }
}
