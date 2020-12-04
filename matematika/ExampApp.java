package matematika;

/**
 * Write a description of class ExampApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class ExampApp {

    String nama;

    public ExampApp(String namaUser) {
        nama = namaUser;
    }

    public ExampApp() {

    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("nama anda : ");
        var namaUser = input.nextLine();

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        ExampApp obj = new ExampApp(namaUser);
        System.out.println("Selamat datang " + obj.nama);

        // beri pilihan ke user
        System.out.println("Pilih tingkat level");
        System.out.println("1.) mudah");
        System.out.println("2.) sedang");
        System.out.println("3.) sulit");
        System.out.print("pilihan : ");

        // pilihan user
        var pilihan = input.nextInt();

        // berikan soal ke user sesuai pilihan
        if (pilihan == 1) {
            Dasar dasar = new Dasar();
            dasar.soalDasar();
        } else if (pilihan == 2) {
            Sedang sedang = new Sedang();
            sedang.soalSedang();
        } else if (pilihan == 3) {
            Sulit sulit = new Sulit();
            sulit.soalSulit();
        } else {
            System.out.println("Pilihan tidak tersedia!");
        }
        input.close();
    }
}
