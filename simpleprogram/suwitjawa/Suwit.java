package simpleprogram.suwitjawa;

import java.util.Scanner;
import java.util.Random;

public class Suwit {
    public static void main(String[] args) {

        var main = true;

        while (main) {
            Scanner input = new Scanner(System.in);

            System.out.println("============ SUWIT JAVA ============");
            var user = inputUser();
            var computer = inputComputer();

            if (user == null) {
                System.out.println("=====================================");
                System.out.println("Pilihan anda tidak dapat bertarung!");
                System.out.println("=====================================");
            } else {
                System.out.print(user);
                System.out.print(" VS ");
                System.out.println(computer);
                System.out.println("Hasil :");
                determinant(user, computer);
            }

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Main lagi?");
            System.out.print("Jawab : ");
            main = input.nextBoolean();

            input.close();
        }
    }

    static String inputUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("gajah | semut | orang");
        System.out.print("pilihan anda : ");
        var pilihan = input.nextLine();

        String PilihanFinal;
        switch (pilihan) {
            case "gajah":
                PilihanFinal = "gajah";
                break;
            case "orang":
                PilihanFinal = "orang";
                break;
            case "semut":
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
        input.close();
        return PilihanFinal;
    }

    static String inputComputer() {
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

        return pilihanFinal;
    }

    static void determinant(String user, String computer) {
        if (user == "gajah") {
            if (computer == "semut") {
                System.out.println("Anda kalah");
            } else if (computer == "orang") {
                System.out.println("Anda menang");
            } else {
                System.out.println("Hasil seri");
            }
        } else if (user == "orang") {
            if (computer == "semut") {
                System.out.println("Anda menang");
            } else if (computer == "gajah") {
                System.out.println("Anda kalah");
            } else {
                System.out.println("Hasil seri");
            }
        } else if (user == "semut") {
            if (computer == "orang") {
                System.out.println("Anda kalah");
            } else if (computer == "gajah") {
                System.out.println("Anda menang");
            } else {
                System.out.println("Hasil seri");
            }
        } else {
            System.out.println("Pilihan anda tidak dapat bertarung!");
        }
    }
}