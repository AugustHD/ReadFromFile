package opg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileWriter {

    public static void main(String[] args) throws FileNotFoundException {
	File file = new File("data/demo.txt");
        try {
            Scanner scanner = new Scanner(file);
            String linje = scanner.nextLine();
            linje = linje;String[] ordliste = linje.split(" ");
            for (int i = 0; i < ordliste.length; i++) {
                String ord = ordliste[i];
                if (ord.length() >= 5) {
                    System.out.print(ordliste[i].toUpperCase() + " ");
                } else {
                    System.out.print(ordliste[i] + " ");
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Kaffepause " + e.getMessage());
        }
    }
}
