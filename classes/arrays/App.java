package classes.arrays;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Integer[] numbers = { 1, 32, 5, 6, 7, 87, 8, 9, 10, 5, 2, };
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
