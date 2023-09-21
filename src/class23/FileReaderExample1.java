package class23;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample1 {
    public static void main(String[] args) {
        String fileName ="C:\\Users\\pares\\IdeaProjects\\Echo\\src\\class23\\source.txt";

        try {
            FileReader fileReader = new FileReader(fileName);
            int data;


            while ((data = fileReader.read()) != -1)
            {
                System.out.print((char) data);
            }
            fileReader.close();
            System.out.println("\nData read from the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
