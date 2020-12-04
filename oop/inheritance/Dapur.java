package oop.inheritance;

import java.util.concurrent.TimeUnit;

public class Dapur {
    void cookFood(String foodName) {
        System.out.println("Process...");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(foodName + " ready to be served");
    }
}
