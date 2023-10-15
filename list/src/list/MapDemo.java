package list;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        // Creating a new HashMap to store key-value pairs (String keys and Integer values)
        Map<String, Integer> studentScores = new HashMap<>();

        // Adding key-value pairs to the map
        studentScores.put("Suriya", 95);
        studentScores.put("Jagadees", 87);
        studentScores.put("Neeraj", 92);
        studentScores.put("Rithwik", 78);

        // Accessing values by key
        String studentName = "Jagadees";
        if (studentScores.containsKey(studentName)) {
            int score = studentScores.get(studentName);
            System.out.println(studentName + "'s score: " + score);
        } else {
            System.out.println("No score found for " + studentName);
        }

        // Updating a value
        studentScores.put("Neeraj", 96); // Updating Neeraj's score

        // Removing a key-value pair
        studentScores.remove("Rithwik");

        // Iterating through the map
        System.out.println("\nStudent scores:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            String name = entry.getKey();
            int score = entry.getValue();
            System.out.println(name + ": " + score);
        }

        // Checking if a key exists in the map
        String searchName = "Eve";
        if (studentScores.containsKey(searchName)) {
            System.out.println("\n" + searchName + " is in the map.");
        } else {
            System.out.println("\n" + searchName + " is not in the map.");
        }

        // Getting the size of the map
        System.out.println("\nNumber of students in the map: " + studentScores.size());

        // Clearing the map
        studentScores.clear();
        System.out.println("Map cleared. Size is now: " + studentScores.size());
    }
}
