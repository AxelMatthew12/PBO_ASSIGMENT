package Kuis2.no2;

public class laptopdemo {
    public static void main(String[] args) {
        // Koleksi Heterogen
        laptop[] laptops = { new msi(), new lenovo(), new acer() };

        // Perulangan untuk menampilkan spesifikasi dan fitur khusus
        for (laptop laptop : laptops) {
            laptop.spesifikasi(); // Pemanggilan Polimorfik

            // instanceof untuk memeriksa
            if (laptop instanceof msi) {
                ((msi) laptop).fiturGaming(); // Casting objek
            } else if (laptop instanceof lenovo) {
                ((lenovo) laptop).fiturBisnis(); // Casting objek
            } else if (laptop instanceof acer) {
                ((acer) laptop).fiturRingan(); // Casting objek
            }

            System.out.println();
        }

        // dengan argumen polimorfik
        System.out.println("Mengujicoba laptop dengan argumen polimorfik:");
        ujiLaptop(new msi());
        ujiLaptop(new lenovo());
        ujiLaptop(new acer());
    }

    //  dengan argumen polimorfik
    public static void ujiLaptop(laptop laptop) {
        System.out.println("Mengujicoba laptop dengan merek: " + laptop.brand);
        laptop.spesifikasi();
    }
}