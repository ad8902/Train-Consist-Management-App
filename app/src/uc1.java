import java.util.ArrayList;

/**
 * Train Consist Management App
 * UC2: Add Passenger Bogies to Train
 *
 * Demonstrates ArrayList operations such as
 * add, remove, and contains.
 *
 * @author Muskan
 * @version 2.0
 */
public class uc1 {

    public static void main(String[] args) {

        // Create ArrayList for passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        System.out.println("=== Train Consist Management App ===");

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nAfter adding bogies:");
        System.out.println(passengerBogies);

        // Remove one bogie
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        // Check existence
        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("\nDoes Sleeper exist? " + exists);

        // Final list state
        System.out.println("\nFinal train consist:");
        System.out.println(passengerBogies);

        System.out.println("\nProgram continues...");
    }
}
