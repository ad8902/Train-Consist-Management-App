import java.util.HashSet;
import java.util.Set;

/**
 * Train Consist Management App
 * UC3: Track Unique Bogie IDs
 *
 * Demonstrates HashSet to ensure unique bogie IDs.
 *
 * @author Muskan
 * @version 3.0
 */
public class uc1{

    public static void main(String[] args) {

        // Create HashSet for unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        System.out.println("=== Train Consist Management App ===");

        // Add bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Display final unique IDs
        System.out.println("\nUnique Bogie IDs:");
        System.out.println(bogieIds);

        System.out.println("\nDuplicate IDs are automatically ignored.");
    }
}
