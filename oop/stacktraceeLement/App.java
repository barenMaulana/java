package oop.stacktraceeLement;

public class App {
    public static void main(String[] args) {
        try {
            String[] students = { "baren", "didi", "rian" };
            System.out.println(students[200]);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
