package classes.dateandcalendar;

import java.util.Calendar;

public class App {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2020, 0, 12);
        var finalTime = calendar.getTime();

        System.out.println(finalTime);
    }
}
