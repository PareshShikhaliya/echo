package class23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample8 {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\pares\\IdeaProjects\\Echo\\src\\class23\\source.txt";

        try {
            FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
            System.out.println("Data read from the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
