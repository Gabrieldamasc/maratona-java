package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created: " + isCreated);
            boolean exists = file.exists();
            System.out.println("last Modified: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            if (exists) {
                System.out.println("Deleted: " + file.delete());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
