package oop.trywithresource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("README.md"));
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (Throwable throwable) {
            System.out.println("error : " + throwable);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                    System.out.println("pembacaan resource closed");
                } catch (IOException ioexception) {
                    System.out.println("error : " + ioexception);
                }
            }
        }
    }
}