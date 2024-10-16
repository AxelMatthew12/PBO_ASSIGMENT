package UTS;

import java.util.Scanner;

public class Main {

    public void menu() {

        Scanner sc = new Scanner(System.in);

        System.out.println("======  HAI ! =====");
        System.out.println("===================");
        System.out.println("||  1.Cek User   ||");
        System.out.println("||  2.Admin      ||");
        System.out.println("||  3.Keluar     ||");
        System.out.println("===================");
        System.out.print("Pilih : ");
        int opsi = sc.nextInt();

        switch (opsi) {
            case 1:
                UserProfile user = new UserProfile(2, "helloworld", "Matthew", 23, "matthew546@cihuy.com");
                user.show_document();
                System.out.println("===========================================");

                Customer pelanggan = new Customer();
                pelanggan.log_in(2, "helloworld");
                pelanggan.apply_verification(new String[] { "anime1.jpg", "anime2.png" });
                System.out.println("Status : " + pelanggan.get_verification_status());
                System.out.println("===========================================");
                break;

            case 2:
                Admin adminnn = new Admin();
                adminnn.log_in(12, "akulahadmin1");
                adminnn.Vehicleadd();
                adminnn.retrieve_Complain();
                adminnn.verifyUser();
                adminnn.log_out();
                System.out.println("===========================================");
                break;

            case 3:
                System.out.println("Anda keluar !");
                break;

            default:
                System.out.println("Mohon maaf tidak ada yg cocok .. masuk lagi !");
                menu(); // memanggil ulang menu jika opsi tidak valid
                break;
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.menu();
    }
}
