package gui.input;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Siapa nama kamu?");
        JOptionPane.showMessageDialog(null, " hello " + name);

        String age = JOptionPane.showInputDialog("berapa umur kamu?");
        Integer.parseInt(age);
        JOptionPane.showMessageDialog(null, " umur kamu : " + age);
    }
}
