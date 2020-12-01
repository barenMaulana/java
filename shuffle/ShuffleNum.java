package shuffle;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

class ShuffleNum {
    public static void main(String[] args) {
        Integer[] angka = { 1, 2, 3, 4, 5, 6, 7, 8 };
        for (var satuAngka : angka) {
            System.out.println(satuAngka);
        }

        System.out.println("================");
        acak(angka);
        System.out.println("================");

        for (var satuAngka : angka) {
            System.out.println(satuAngka);
        }
    }

    static Integer[] acak(Integer... angka) {

        List<Integer> intList = Arrays.asList(angka);

        Collections.shuffle(intList);
        intList.toArray(angka);

        return angka;
    }

}