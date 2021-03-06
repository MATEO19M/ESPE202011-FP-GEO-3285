package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public static boolean createFile(String fileName) {
        boolean created = false;
        try {
            File file = new File(fileName + ".txt");
            if (file.createNewFile()) {
                System.out.println("file was created");

                created = true;
            } else {
                System.out.println("file already exists");
                created = false;

            }
        } catch (IOException ex) {
            ex.printStackTrace();
            created = false;
        }
        return created;

    }

    public static boolean save(String data, String fileName) {
        boolean saved = false;

        createFile(fileName);

        try {
            FileWriter myWrite = new FileWriter(fileName + ".txt", true);
            myWrite.write(System.getProperty("line.separator") + data);
            myWrite.close();
            System.out.println("a new record of " + fileName + " was saved");
            saved = true;

        } catch (IOException ex) {
            ex.printStackTrace();
            saved = false;
        }

        return saved;
    }

    public static String read(String fileName) {
        fileName = null;
        String products = null;
        String file = "C:\\Users\\Acer\\Documents\\NetBeansProjects\\ESPE202011-FP-GEO-3285\\workshops\\unit3\\WS27ADT\\ComputerShopSystem\\Monitor.txt";
        try (BufferedReader textBr = new BufferedReader(new FileReader(file))) {
            while ((fileName = textBr.readLine()) != null) {
                products = fileName;
            }
        } catch (IOException e) {
            System.out.println("Have an error");
            e.printStackTrace();
        }
        return products;

    }
}
