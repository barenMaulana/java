package classes.base64;

import java.util.Base64;

public class App {
    public static void main(String[] args) {
        String name = "baren maulana";
        String result1 = Base64.getEncoder().encodeToString(name.getBytes());
        System.out.println(result1);

        byte[] result2 = Base64.getDecoder().decode(result1);
        String result3 = new String(result2);
        System.out.println(result2);
        System.out.println(result3);
    }

}
