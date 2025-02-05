package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        try {
            // Using FileWriter
            FileWriter f = new FileWriter("C:\\Users\\gupta\\Downloads\\java.txt");
            f.write("Hello, this is Java, and I wrote this using the FileWriter method...\n\n");
            f.close();
            System.out.println("File written successfully using FileWriter.");

            // Using BufferedWriter
            BufferedWriter f1 = new BufferedWriter(new FileWriter("C:\\Users\\gupta\\Downloads\\java.txt", true));
            f1.write("This is written using the BufferedWriter method.\n");
            f1.close();
            System.out.println("File written successfully using BufferedWriter.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
