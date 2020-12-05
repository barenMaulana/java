package oop.variablehiding;

public class Chef extends Dapur {
    String foodName;

    public void cook(String foodName) {
        System.out.println("mulai memasak " + super.foodName + " dengan chef dan juga memasak " + foodName);
    }
}
