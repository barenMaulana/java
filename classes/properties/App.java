package classes.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class App {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("application.properties"));

            String host = properties.getProperty("database.host");
            String dbname = properties.getProperty("database.name");
            String username = properties.getProperty("database.username");
            String password = properties.getProperty("database.password");

            System.out.println(host);
            System.out.println(dbname);
            System.out.println(username);
            System.out.println(password);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Properties user = new Properties();
        user.put("name", "baren maulana");
        user.put("age", "18");
        user.put("majors", "REKAYASA PERANGKAT LUNAK");

        try {
            user.store(new FileOutputStream("user.properties"), "");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
