
/**
 * Write a description of class Create here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

class Create {
    String judul;
    String soal;

    public void createSoal(String soal, String judul, int jawaban) {
        Scanner input = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("=== " + judul + " ===");
        System.out.println("==================================");
        System.out.println("Pertanyaan : ");
        System.out.println(soal);
        System.out.print("Jawab : ");
        var hasil = input.nextInt();

        if (hasil == jawaban) {
            System.out.println("Anda menjawab dengan benar");
        } else {
            System.out.println("Jawaban anda salah");
        }

        input.close();
    }
}

