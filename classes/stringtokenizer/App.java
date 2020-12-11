package classes.stringtokenizer;

import java.util.StringTokenizer;

public class App {
    public static void main(String[] args) {
        String value = "baren maulana";
        StringTokenizer str = new StringTokenizer(value, " ");
        while (str.hasMoreTokens()) {
            StringBuilder newStr = new StringBuilder();
            newStr.append(str.nextToken());
            System.out.println(newStr.toString());
        }
    }
}
