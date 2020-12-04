package oop.construct;

public class Dapur {
    String foodName;
    Integer foodAmount;

    Dapur(String foodName) {
        this.foodName = foodName;
    }

    Dapur(Integer foodAmount) {
        this.foodAmount = foodAmount;
    }

    Dapur(String foodName, Integer foodAmount) {
        this.foodAmount = foodAmount;
        this.foodName = foodName;
    }
}
