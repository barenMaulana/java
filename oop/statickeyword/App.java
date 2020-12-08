package oop.statickeyword;

public class App {
    public static void main(String[] args) {
        // static method,field,inner class,static block
        Dapur.hireChef();
        System.out.println(Dapur.FOODNAME);
        Chef.SousChef sousChef = new Chef.SousChef();
        sousChef.makeSous();

    }
}
