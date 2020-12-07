package oop.hashcode;

public class Dapur {
    int foodCount;
    String foodName;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + foodCount;
        result = prime * result + ((foodName == null) ? 0 : foodName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dapur other = (Dapur) obj;
        if (foodCount != other.foodCount)
            return false;
        if (foodName == null) {
            if (other.foodName != null)
                return false;
        } else if (!foodName.equals(other.foodName))
            return false;
        return true;
    }

}
