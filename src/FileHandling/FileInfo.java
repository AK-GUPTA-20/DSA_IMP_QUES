package FileHandling;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileInfo {
    private String filePath;

    // Constructor
    public FileInfo(String filePath) {
        this.filePath = filePath;
    }

    // Method to display file information
    public void displayFileInfo() {
        File file = new File(filePath);

        if (file.exists()) {
            System.out.println("File Information:");
            System.out.println("Name: " + file.getName());
            System.out.println("Path: " + file.getAbsolutePath());
            try {
                System.out.println("Canonical Path: " + file.getCanonicalPath());
            } catch (IOException e) {
                System.out.println("Error retrieving canonical path: " + e.getMessage());
            }
            System.out.println("Is Directory: " + file.isDirectory());
            System.out.println("Is File: " + file.isFile());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("File Size: " + file.length() + " bytes");

            // Format and display the last modified date
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            System.out.println("Last Modified: " + sdf.format(new Date(file.lastModified())));
        } else {
            System.out.println("The file does not exist.");
        }
    }

    public static void main(String[] args) {
        FileInfo fileInfo = new FileInfo("C:\\Users\\gupta\\Downloads\\java.txt");
        fileInfo.displayFileInfo();
    }
}
