package class25;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.channels.FileLock;

public class FileChannelExample13 {
    public static void main(String[] args) {
        // Define the path to the file
        Path filePath = Path.of("example.txt");

        try (FileChannel fileChannel = FileChannel.open(filePath, StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.READ)) {
            // Write data to the file
            String message = "Hello, FileChannel!";
            ByteBuffer writeBuffer = ByteBuffer.wrap(message.getBytes());
            fileChannel.write(writeBuffer); // Write the message to the file

            // Position the file pointer to the beginning
            fileChannel.position(0);

            // Read data from the file
            ByteBuffer readBuffer = ByteBuffer.allocate(1024); // Allocate a buffer for reading
            int bytesRead = fileChannel.read(readBuffer); // Read data from the file into the buffer
            readBuffer.flip(); // Prepare the buffer for reading

            byte[] data = new byte[bytesRead]; // Create an array to hold the read data
            readBuffer.get(data); // Get data from the buffer into the array
            String readMessage = new String(data); // Convert the read data to a string
            System.out.println("Read message: " + readMessage); // Print the read message

            // Demonstrate file locking
            FileLock lock = fileChannel.lock(); // Lock the entire file
            System.out.println("File locked.");

            // Try to write to the locked file (will block until unlocked)
            String lockedMessage = "This message is locked.";
            ByteBuffer lockedBuffer = ByteBuffer.wrap(lockedMessage.getBytes());
            fileChannel.write(lockedBuffer); // Attempt to write to the locked file (blocks)
            System.out.println("Write to locked file.");

            // Unlock the file
            lock.release(); // Release the file lock
            System.out.println("File unlocked.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
