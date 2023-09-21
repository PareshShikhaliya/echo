package class23;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample2 {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\pares\\IdeaProjects\\Echo\\src\\class23\\destination.txt";

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            String content = "Hello, World! how are u? today we are learning files";
            fileWriter.write(content);
            fileWriter.close();
            System.out.println("Data written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
