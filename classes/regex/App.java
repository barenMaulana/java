package classes.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        String nama = "baren maulana";
        Pattern patern = Pattern.compile("[a-zA-Z]*[l][a-zA-Z]*"); // saya mencari kata yang ada huruf l nya
        Matcher matcher = patern.matcher(nama);

        while (matcher.find()) {
            String name = matcher.group();
            System.out.println(name);
        }
    }
}
