package UTS.Soalno2;

public class SepedaGunung extends Sepeda {
    private int bike_id;
    private String name;
    private String merk;

    public SepedaGunung() {
        System.out.println("Objek dari class Sepeda Gunung dibuat");
    }

    public int getBike_id() {
        return bike_id;
    }

    public void setBike_id(int bike_id) {
        this.bike_id = bike_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getInfo() {
        return "Bike_id   :" + this.bike_id + "\n" +
                "Nama      :" + this.name + "\n" +
                "Merk      :" + this.merk + "\n";
    }
}
