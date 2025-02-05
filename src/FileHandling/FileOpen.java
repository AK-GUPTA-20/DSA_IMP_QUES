package FileHandling;
import java.io.File;
import java.io.IOException;

public class FileOpen {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\gupta\\Downloads\\java.txt");
        try{
            if(f.createNewFile())
                System.out.println("file maked successfully...");
            else System.out.println("file is already maked");
        }

        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
