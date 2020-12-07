package oop.equals;

public class Dapur {
    int foodCount;
    String foodName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Dapur)) {
            return false;
        }

        final Dapur dapur = (Dapur) obj;

        if (this.foodCount != dapur.foodCount) {
            return false;
        }

        if ((this.foodName == null) ? (dapur.foodName != null) : !this.foodName.equals(dapur.foodName)) {
            return false;
        }

        return true;
    }
}
