package Kuis2.no2;

class lenovo extends laptop {
    public lenovo() {
        super("Lenovo");
    }

    @Override
    void spesifikasi() {
        System.out.println("Merek: Lenovo - Laptop yang dapat diandalkan dan terjangkau untuk pekerjaan.");
    }

    void fiturBisnis() {
        System.out.println("Alat bisnis terintegrasi diaktifkan!");
    }
}