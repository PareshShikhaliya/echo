package class23;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample6 {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\pares\\IdeaProjects\\DeltaBatch\\src\\Module1.class23\\destination1.txt";

        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            String content = "Hello, World!";
            byte[] data = content.getBytes();
            fos.write(data);
            fos.close();
            System.out.println("Data written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
