package adapter.adapter3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO fileIO = new FileProperties();

        try {
            fileIO.readFromFile("src/adapter/file.txt");
            fileIO.setValue("year", "2004");
            fileIO.setValue("month", "4");
            fileIO.setValue("day", "21");
            fileIO.writeToFile("src/adapter/newFile.txt");
            System.out.println(fileIO.getValue("year"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
