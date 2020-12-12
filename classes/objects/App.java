package classes.objects;

import java.util.Objects;

public class App {
    public static void main(String[] args) {
        execute(null);
    }

    public static void execute(Obj obj) {
        System.out.println(Objects.toString(obj));
        System.out.println(Objects.hashCode(obj));
    }
}