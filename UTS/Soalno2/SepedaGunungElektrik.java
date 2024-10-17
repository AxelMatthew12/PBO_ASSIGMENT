package UTS.Soalno2;

public class SepedaGunungElektrik extends SepedaGunung {
    private int dayaBaterai;

    public SepedaGunungElektrik(int bike_id, String name, String merk, int dayaBaterai) {
        super();
        this.setBike_id(bike_id);
        this.setName(name);
        this.setMerk(merk);
        this.dayaBaterai = dayaBaterai;
    }

    @Override
    public String getInfo() {

        String infoSepedaGunung = super.getInfo();

        String infoDayaBaterai = "Daya Baterai: " + this.dayaBaterai + " mAh\n";

        return infoSepedaGunung + infoDayaBaterai;
    }

    public void setDayaBaterai(int dayaBaterai) {
        this.dayaBaterai = dayaBaterai;
    }

    public int getDayaBaterai() {
        return dayaBaterai;
    }
}
