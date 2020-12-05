package oop.typecheck;

public class App {
    public static void main(String[] args) {
        new Siswa("baren");
        new Guru("budi maulana");
        new Staf("Witch nina");

        System.out.println("");
        System.out.println(" ====================== divider ===================== ");
        System.out.println("");

        typecheck(new Guru("kudil maulana"));
        System.out.println("");

        typecheck(new Siswa("baren maulana"));
        System.out.println("");

        typecheck(new Staf("undul maulana"));
        System.out.println("");
    }

    static void typecheck(Greet greet) {
        if (greet instanceof Siswa) {
            System.out.println("ini instance dari objek siswa");
        } else if (greet instanceof Guru) {
            System.out.println("ini instance dari objek guru");
        } else if (greet instanceof Staf) {
            System.out.println("ini instance dari objek Staf");
        } else {
            System.out.println("ini instance dari objek Greet");
        }
    }
}