/**
 * This file lists all text-files in a given directory 
 * and logs them.
 * 
 * @author Florian Dahlitz
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ListFiles {
    
    public static void main(String[] args) {
        
        System.out.println("------------------------------");
        System.out.println("Initialising logger...");
        System.out.println("------------------------------");
        Logger ocajLogger = Logger.getLogger("OCAJ Logger");

        try {
            System.out.println("Collecting files...");
            System.out.println("------------------------------");

            Files.walk(Paths.get("P:\\src_for_filesystem_applications")).forEach(file -> {
                if(file.getFileName().toString().endsWith(".txt")) {
                    ocajLogger.log(Level.INFO, "Text doc: " + file.getFileName());
                }
            });
        } catch (IOException e) {
            System.out.println("Stopped unexpectatly.");
            System.out.println("------------------------------");

            e.printStackTrace();
        }

        System.out.println("------------------------------");
        System.out.println("Finished.");
        System.out.println("------------------------------");
    }
}