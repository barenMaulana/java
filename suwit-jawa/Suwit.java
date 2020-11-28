import java.util.Scanner;

import javax.sound.midi.SysexMessage;

import java.util.Random;

public class Suwit {
    public static void main(String[] args) {
        System.out.println("============ SUWIT JAVA ============");
        // inputUser();
        inputComputer();
    }

    static void inputUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("gajah | semut | orang");
        System.out.print("pilihan anda : ");
        var pilihan = input.nextLine();

        String PilihanFinal;
        switch (pilihan) {
            case "gajah":
                System.out.println("anda memilih gajah!");
                PilihanFinal = "gajah";
                break;
            case "orang":
                System.out.println("anda memilih orang!");
                PilihanFinal = "orang";
                break;
            case "semut":
                System.out.println("anda memilih semut!");
                PilihanFinal = "semut";
                break;
            default:
                System.out.println(
                        "==========================================================================================");
                System.out.println(
                        "Pilihan anda tidak sesuai dengan yang kami arahkan, tolong pilih semut,gajah,atau orang");
                System.out.println(
                        "==========================================================================================");
                PilihanFinal = null;
                break;
        }

    }

    static void inputComputer() {
        Random rand = new Random();
        int randNumber = rand.nextInt(10);

        String pilihanFinal;
        if (randNumber <= 4) {
            pilihanFinal = "gajah";
        } else if (randNumber >= 5 && randNumber <= 7) {
            pilihanFinal = "orang";
        } else {
            pilihanFinal = "semut";
        }

        System.out.println(pilihanFinal);
    }

}