package hewan;

import java.util.Scanner;

public class Herbivora {

    String nama;
    int kaki;
    String habitat;

    public static void main(String[] args) {
        // tampilkan pilihan soal
        System.out.println("Silahkan pilih tingkat kesulitan soal sesuai nomor :");
        System.out.println("1.) Mudah");
        System.out.println("2.) Sedang");
        System.out.println("3.) Susah");

        // ambil pilihan user
        Scanner input = new Scanner(System.in);
        int pilihanUser = input.nextInt();

        // kelola pilihan user
        switch (pilihanUser) {
            case 1:
                soalMudah();
                break;
            case 2:
                soalSedang();
                break;
            case 3:
                soalSusah();
                break;
            default:
                System.out.println("pilihan anda tidak sesuai penawaran!");
                break;
        }
    }

    static void soalMudah() {
        // set jawaban
        var jawaban = "jerapah";

        // berikan soal ke user
        System.out.println("=============================================================================");
        System.out.println("================================ SOAL MUDAH =================================");
        System.out.println("=============================================================================");
        System.out.println("");
        System.out.println("");
        System.out.println("Soal :");
        System.out.println("Memiliki leher panjang, hewan herbivora, berwarna oren bercak coklat. hewan apakah itu?");

        // terima jawaban user
        // cocokan dengan jawaban valid
        // tampilkan hasil
        Scanner input = new Scanner(System.in);
        var jawabanUser = input.nextLine();

        switch (jawabanUser) {
            case "jerapah":
                System.out.println("Selamat jawaban anda benar!!!");
                break;

            default:
                System.out.println("maaf jawaban anda kurang tepat, yang benar adalah : " + jawaban);
                break;
        }
    }

    static void soalSedang() {
        // set jawaban
        var jawaban = "ngengat";

        // berikan soal ke user
        System.out.println("=============================================================================");
        System.out.println("================================ SOAL SEDANG =================================");
        System.out.println("=============================================================================");
        System.out.println("");
        System.out.println("");
        System.out.println("Soal :");
        System.out.println("Tubuh dia lebih besar dari kupu-kupu, dia memiliki sayap layaknya kupu-kupu");
        System.out.println("tapi tidak sebagus kupu-kupu coraknya, hewan apakah itu?");

        // terima jawaban user
        // cocokan dengan jawaban valid
        // tampilkan hasil
        Scanner input = new Scanner(System.in);
        var jawabanUser = input.nextLine();

        switch (jawabanUser) {
            case "ngengat":
                System.out.println("Selamat jawaban anda benar!!!");
                break;

            default:
                System.out.println("maaf jawaban anda kurang tepat, yang benar adalah : " + jawaban);
                break;
        }
    }

    static void soalSusah() {
        // set jawaban
        var jawaban = "llama";

        // berikan soal ke user
        System.out.println("=============================================================================");
        System.out.println("================================ SOAL SUSAH =================================");
        System.out.println("=============================================================================");
        System.out.println("");
        System.out.println("");
        System.out.println("Soal :");
        System.out.println("Dia memiliki leher panjang, tapi tidak sepanjang jerapah, dia memiliki bulu yang tebal");
        System.out.println(
                "dengan warna yang berbeda beda,seperti coklat,hitam,putih,abu-abu. dia hewan herbivora dan memiliki 4 kaki");
        System.out.println("Hewan apakah itu?");

        // terima jawaban user
        // cocokan dengan jawaban valid
        // tampilkan hasil
        Scanner input = new Scanner(System.in);
        var jawabanUser = input.nextLine();

        switch (jawabanUser) {
            case "llama":
                System.out.println("Selamat jawaban anda benar!!!");
                break;

            default:
                System.out.println("maaf jawaban anda kurang tepat, yang benar adalah : " + jawaban);
                break;
        }
    }
}
