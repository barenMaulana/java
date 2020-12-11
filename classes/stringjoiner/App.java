package classes.stringjoiner;

import java.util.StringJoiner;

public class App {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(",", "[", "]");
        joiner.add("baren");
        joiner.add("maulana");
        joiner.add("didi");
        System.out.println(joiner.toString());
    }
}
