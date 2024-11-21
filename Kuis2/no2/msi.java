package Kuis2.no2;

class msi extends laptop {
    public msi() {
        super("MSI");
    }

    @Override
    void spesifikasi() {
        System.out.println("Merek: MSI - Laptop gaming dengan perangkat keras performa tinggi.");
    }

    void fiturGaming() {
        System.out.println("Mode Gaming khusus diaktifkan!");
    }
}