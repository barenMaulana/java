package terminalcalculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        // tampilkan pilihan operasi artimatika
        System.out.println("pilih operasi artimatika");
        System.out.println("1. penjumlahan");
        System.out.println("2. pengurangan");
        System.out.println("3. perkalian");
        System.out.println("4. pembagian");
        System.out.println("pilihan :");
        Integer pilihan = input.nextInt();

        // cek pilihan user
        if (pilihan == 1) {
            System.out.println("================== PENJUMLAHAN ==================");
            System.out.print("Nilai pertama :");
            int nilai1 = input.nextInt();

            System.out.print("Nilai kedua :");
            int nilai2 = input.nextInt();

            System.out.print("Hasil = ");
            System.out.println(nilai1 + nilai2);
        } else if (pilihan == 2) {
            System.out.println("================== PENGURANGAN ==================");
            System.out.print("Nilai pertama :");
            int nilai1 = input.nextInt();

            System.out.print("Nilai kedua :");
            int nilai2 = input.nextInt();

            System.out.print("Hasil = ");
            System.out.println(nilai1 - nilai2);
        } else if (pilihan == 3) {
            System.out.println("================== PERKALIAN ==================");
            System.out.print("Nilai pertama :");
            int nilai1 = input.nextInt();

            System.out.print("Nilai kedua :");
            int nilai2 = input.nextInt();

            System.out.print("Hasil = ");
            System.out.println(nilai1 * nilai2);
        } else if (pilihan == 4) {
            System.out.println("================== PEMBAGIAN ==================");
            System.out.print("Nilai pertama :");
            int nilai1 = input.nextInt();

            System.out.print("Nilai kedua :");
            int nilai2 = input.nextInt();

            System.out.print("Hasil = ");
            System.out.println(nilai1 / nilai2);
        } else {
            System.out.println("Tidak ada pilihan yang cocok");
        }
        System.out.println("Program selesai");
        input.close();
    }
}
