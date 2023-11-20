import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapStudentID {
    public static void main(String[] args) {
        // Create a HashMap to store student information (ID -> Name)
        Map<Integer, String> studentMap = new HashMap<>();

        // Add some initial data
        studentMap.put(1129812, "Kate");
        studentMap.put(2213870, "Millie");
        studentMap.put(3234675, "Jack");

        // Display the initial student information
        System.out.println("Initial Student Information:");
        displayStudentMap(studentMap);

        // Allow the user to add more students interactively
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter new student information or type 'exit' to finish.");

        while (true) {
            System.out.print("Enter student ID (or 'exit'): ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("exit")) {
                break;
            }

            try {
                int studentID = Integer.parseInt(input);

                System.out.print("Enter student name: ");
                String studentName = scanner.nextLine().trim();

                // Add the new student information to the HashMap
                studentMap.put(studentID, studentName);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid student ID or 'exit'.");
            }
        }

        // Display the updated student information
        System.out.println("\nUpdated Student Information:");
        displayStudentMap(studentMap);

        scanner.close();
    }

    private static void displayStudentMap(Map<Integer, String> studentMap) {
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
