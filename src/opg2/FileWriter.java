package opg2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileWriter {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data/DMI.txt");
        int amountOfLines = 0;
        ArrayList<String> data = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
               data.add(scanner.nextLine());
            }
            // Dette nedenfor er ineffektivt siden jeg skulle tilføjde en ny variabel hver gang der kommer en ny linje
            // i tekst filen.
            double line1 = Double.parseDouble(data.get(0));
            double line2 = Double.parseDouble(data.get(1));
            double line3 = Double.parseDouble(data.get(2));

            BufferedReader reader = new BufferedReader(new FileReader("data/DMI.txt"));
            while (reader.readLine() != null) amountOfLines++;
            reader.close();

            double onAverageUnrounded = (line1 + line2 + line3) / amountOfLines;
            int onAverage = (int) Math.round(onAverageUnrounded);
            System.out.println("Gennemsnits temperatur: " + onAverage);


        } catch (FileNotFoundException e) {
            System.out.println("Kaffepause " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


