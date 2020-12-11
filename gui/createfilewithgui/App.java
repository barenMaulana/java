package gui.createfilewithgui;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        String namaFile = JOptionPane.showInputDialog("Nama file?");
        JOptionPane.showMessageDialog(null, "Pembuatan file dengan nama " + namaFile);

        String isiContent = JOptionPane.showInputDialog("Tulis sesuatu untuk file");
        JOptionPane.showMessageDialog(null, "yeay...");
        try {
            FileWriter writer = new FileWriter(namaFile);
            writer.write(isiContent);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
