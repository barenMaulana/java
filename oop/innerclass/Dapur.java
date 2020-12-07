package oop.innerclass;

public class Dapur {
    private String resep;
    private String chefName;

    public String getResep() {
        return resep;
    }

    public void setResep(String resep) {
        this.resep = resep;
    }

    public String getChefName() {
        return chefName;
    }

    public void setChefName(String chefName) {
        this.chefName = chefName;
    }

    // inner class boi
    class Chef {
        String resep;

        public String getResep() {
            return resep;
        }

        public void setResep(String resep) {
            this.resep = resep;
        }

    }

}
