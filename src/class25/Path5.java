package class25;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Path5 {
    public static void main(String[] args) {
        // Create a Path representing a file
        Path filePath = Paths.get("C:/Users/pares/IdeaProjects/Echo/src/class25/input.txt");

        // Get information about the path
        System.out.println("Path: " + filePath.toString());
        System.out.println("File name: " + filePath.getFileName());
        System.out.println("Parent directory: " + filePath.getParent());
        System.out.println("Root directory: " + filePath.getRoot());
        System.out.println("Number of elements in path: " + filePath.getNameCount());

        // Check if the file exists
        System.out.println("File exists: " + filePath.toFile().exists());

        // Convert the path to an absolute path
        Path absolutePath = filePath.toAbsolutePath();
        System.out.println("Absolute path: " + absolutePath);

    }
}
