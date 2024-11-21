package Kuis2.no2;

class acer extends laptop {
    public acer() {
        super("Acer");
    }

    @Override
    void spesifikasi() {
        System.out.println("Merek: Acer - Performa seimbang untuk penggunaan sehari-hari.");
    }

    void fiturRingan() {
        System.out.println("Mode ringan dan portabel diaktifkan!");
    }
}