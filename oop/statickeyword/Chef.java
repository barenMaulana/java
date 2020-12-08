package oop.statickeyword;

public class Chef {
    public static final String SOUS = "saus tomat";

    public static class SousChef {
        void makeSous() {
            System.out.println("membuat " + SOUS);
        }
    }
}
