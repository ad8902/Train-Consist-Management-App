import java.util.ArrayList;
import java.util.List;

/**
 * Train Consist Management App
 * UC1: Initialize Train and Display Consist Summary
 *
 * Initializes an empty train consist and displays
 * the initial bogie count.
 *
 * @author Muskan
 * @version 1.0
 */
public class uc1 {

    public static void main(String[] args) {

        // Initialize empty train consist
        List<String> consist = new ArrayList<>();

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Display initial bogie count
        System.out.println("Train consist initialized successfully.");
        System.out.println("Initial bogie count: " + consist.size());

        System.out.println("Program continues...");
    }
}
